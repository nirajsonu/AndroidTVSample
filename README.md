# AndroidTVSample
1)AppcompactActivity no used only Activity/frgament
		2)OnkeyListner insted of OnClickListener 
		3)onFocusListner
		4)Leanback
		
	
		setOnFocusChangeListener 
		setOnKeyListener
		
		Android Leanback
		
		
		Manifest setup
		Activity for TV (Required) - In your application manifest,
		CATEGORY_LEANBACK_LAUNCHER for Tv launcher activity
		<manifest>
    
	<uses-feature android:name="android.software.leanback"	
        android:required="false" />
    ...
</manifest>

<manifest>
    <uses-feature android:name="android.hardware.touchscreen"
              android:required="false" />
    ...
</manifest>

 android:banner="@drawable/banner"
 
 
 androidx.leanback.app
androidx.leanback.database
androidx.leanback.graphics
androidx.leanback.media
androidx.leanback.preference
androidx.leanback.system
androidx.leanback.widget
androidx.leanback.widget.picker


VerticalGridSupportFragment 
RowsSupportFragment
BrowseSupportFragment


BrowseLane:they called the left side(the dark one) is called BrowseLane.
BrowseRow:and the biggest area is called BrowseRow



extends FrgamentActivity

https://www.youtube.com/watch?v=Z6FT4ICaqLM&list=PLF2qkjrNCW_JBDnn32WMd47Zq2SgWL9w-&index=2

ListRowPresenter it helps to compile our Rows(BrowseLane and BrowseRow)
generate Views and bind Objects to them on demand.
Constucts an adapter that uses the given Presenter for all items on the screen.
For Example
ArrayObjectAdapter browseViewAdapter=new ArrayObjectAdapter(new ListRowPresenter())
