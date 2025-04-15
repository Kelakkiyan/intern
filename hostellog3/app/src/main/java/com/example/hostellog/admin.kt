<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:padding="16dp">

<!-- Toolbar -->
<androidx.appcompat.widget.Toolbar
android:id="@+id/adminToolbar"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:background="?attr/colorPrimary"
android:title="Admin Dashboard"
android:titleTextColor="@android:color/white"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent" />

<!-- View Logs Button -->
<Button
android:id="@+id/btnViewLogs"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="View Logs"
app:layout_constraintTop_toBottomOf="@id/adminToolbar"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
android:layout_marginTop="24dp" />

<!-- Manage Users Button -->
<Button
android:id="@+id/btnManageUsers"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Manage Users"
app:layout_constraintTop_toBottomOf="@id/btnViewLogs"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
android:layout_marginTop="16dp" />

<!-- Logout Button -->
<Button
android:id="@+id/btnLogout"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Logout"
app:layout_constraintTop_toBottomOf="@id/btnManageUsers"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
android:layout_marginTop="16dp" />

</androidx.constraintlayout.widget.ConstraintLayout><?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:padding="16dp">

<!-- Toolbar -->
<androidx.appcompat.widget.Toolbar
android:id="@+id/adminToolbar"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:background="?attr/colorPrimary"
android:title="Admin Dashboard"
android:titleTextColor="@android:color/white"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent" />

<!-- View Logs Button -->
<Button
android:id="@+id/btnViewLogs"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="View Logs"
app:layout_constraintTop_toBottomOf="@id/adminToolbar"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
android:layout_marginTop="24dp" />

<!-- Manage Users Button -->
<Button
android:id="@+id/btnManageUsers"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Manage Users"
app:layout_constraintTop_toBottomOf="@id/btnViewLogs"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
android:layout_marginTop="16dp" />

<!-- Logout Button -->
<Button
android:id="@+id/btnLogout"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Logout"
app:layout_constraintTop_toBottomOf="@id/btnManageUsers"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
android:layout_marginTop="16dp" />

</androidx.constraintlayout.widget.ConstraintLayout>