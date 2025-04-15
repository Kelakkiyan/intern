class OutActivity : AppCompatActivity() {
    private lateinit var db: AppDatabase
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private var entries = mutableListOf<Entry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_out)

        db = AppDatabase.getDatabase(this)
        listView = findViewById(R.id.entryListView)

        CoroutineScope(Dispatchers.IO).launch {
            entries = db.entryDao().getActiveEntries().toMutableList()
            val names = entries.map { it.name }
            withContext(Dispatchers.Main) {
                adapter = ArrayAdapter(this@OutActivity, android.R.layout.simple_list_item_1, names)
                listView.adapter = adapter
            }
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            val now = Calendar.getInstance()
            val time = "${now.get(Calendar.HOUR_OF_DAY)}:${now.get(Calendar.MINUTE)}"
            entries[position].timeOut = time
            CoroutineScope(Dispatchers.IO).launch {
                db.entryDao().updateEntry(entries[position])
                finish()
            }
        }
    }
}
