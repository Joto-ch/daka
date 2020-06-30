<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#FFFAFA"
        android:layout_marginTop="10dp">

        <ImageView
            android:id="@+id/book_image"
            android:layout_width="72dp"
            android:layout_height="144dp"
            android:layout_marginLeft="10dp"
            android:src="@mipmap/logo_round"/>

        <TextView
            android:id="@+id/book_name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="24dp"
            android:layout_marginLeft="20dp"
            android:layout_toRightOf="@+id/book_image"
            android:text="dkfksjkfljd"/>

        <TextView
            android:id="@+id/book_introduction"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="18dp"
            android:layout_marginLeft="20dp"
            android:layout_marginTop="10dp"
            android:maxLines="2"
            android:layout_below="@+id/book_name"
            android:layout_toRightOf="@+id/book_image"
            android:text="ksjdfksjadfklksjglkjslkgjkdjkgdjkgjd"/>

    </RelativeLayout>

</LinearLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           