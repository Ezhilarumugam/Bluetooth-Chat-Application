<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".DeviceListActivity">

    <ProgressBar
        android:id="@+id/progress_scan_devices"
        android:layout_width="25dp"
        android:layout_height="25dp"
        android:layout_gravity="center"
        android:visibility="gone"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/str_paired_devices" />

    <ListView
        android:id="@+id/list_paired_devices"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/str_available_devices" />

    <ListView
        android:id="@+id/list_available_devices"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

</LinearLayout>
