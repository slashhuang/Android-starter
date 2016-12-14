package com.slashhuang.myfirstapplication.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.slashhuang.myfirstapplication.R;


//activity在onStart()被调用后开始被用户可见，但是 onResume()会迅速被执行使得activity停留在Resumed状态
//在系统调用 onCreate()) 之后，它会快速调用 onStart())，紧接着快速调用 onResume()
public class lifeCycle extends AppCompatActivity {
    TextView mTextView;// Member variable for text view in the layout
//    默认情况下, 系统使用 Bundle 实例来保存每一个View(视图)对象中的信息(例如输入EditText 中的文本内容)。因此，如果Activity被destroyed与recreated, 则layout的状态信息会自动恢复到之前的状态
//    : 为了使Android系统能够恢复Activity中的View的状态，每个View都必须有一个唯一ID，由android:id定义
//    通常来说，跳转到其他的activity或者是点击Home都会导致当前的activity执行onSaveInstanceState，因为这种情况下的activity都是有可能会被destory并且是需要保存状态以便后续恢复使用的，而从跳转的activity点击back回到前一个activity，那么跳转前的activity是执行退栈的操作，所以这种情况下是不会执行onSaveInstanceState的，因为这个activity不可能存在需要重建的操作
    @Override
    //关于bundle的说明
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the user interface layout for this Activity
        // The layout file is defined in the project res/layout/activity_life_cycle.xml file
        setContentView(R.layout.activity_life_cycle);
        // Initialize member TextView so we can manipulate it later
        mTextView = (TextView) findViewById(R.id.textView2);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();  // Always call the superclass
        // Stop method tracing that the activity started during onCreate()
        android.os.Debug.stopMethodTracing();
    }
//    onPause()会是一个比较好的地方去做那些释放资源的操作,应该把那些heavy-load的工作放到onStop()去做
    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first

        // Release the Camera because we don't need it when paused
        // and other activities might need to use it.
//        if (mCamera != null) {
//            mCamera.release();
//            mCamera = null;
//        }
    }
//    应该实现onResume()来初始化那些在onPause方法里面释放掉的组件，并执行那些activity每次进入Resumed state都需要的初始化动作
    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first

        // Get the Camera instance as the activity achieves full user focus
//        if (mCamera == null) {
//            initializeCamera(); // Local method to handle camera init
//        }
    }
//    Activity类提供了onStop()与onRestart()方法来允许在activity停止与重启时进行调用。不同于暂停状态的部分阻塞UI，停止状态是UI不再可见并且用户的焦点转移到另一个activity中.
//  使用onStop()来执行那些CPU intensive的shut-down操作，例如往数据库写信息。
    @Override
    protected void onStop() {
        super.onStop();  // Always call the superclass method first

        // Save the note's current draft, because the activity is stopping
        // and we want to be sure the current note progress isn't lost.
//        ContentValues values = new ContentValues();
//        values.put(NotePad.Notes.COLUMN_NAME_NOTE, getCurrentNoteText());
//        values.put(NotePad.Notes.COLUMN_NAME_TITLE, getCurrentNoteTitle());
//
//        getContentResolver().update(
//                mUri,    // The URI for the note to update.
//                values,  // The map of column names and new values to apply to them.
//                null,    // No SELECT criteria are used.
//                null     // No WHERE columns are used.
//        );
    }
//    onRestart()方法则是只在activity从stopped状态恢复时才会被调用
//    因为用户很可能在回到这个activity之前已经过了很长一段时间，所以onStart()方法是一个比较好的地方来验证某些必须的系统特性是否可用。
    @Override
    protected void onRestart() {
        super.onRestart();  // Always call the superclass method first

        // Activity being restarted from stopped state
    }
    static final String STATE_SCORE = "playerScore";
    static final String STATE_LEVEL = "playerLevel";
//    通常来说，跳转到其他的activity或者是点击Home都会导致当前的activity执行onSaveInstanceState，
//    因为这种情况下的activity都是有可能会被destory并且是需要保存状态以便后续恢复使用的，
//    而从跳转的activity点击back回到前一个activity，那么跳转前的activity是执行退栈的操作，
//    所以这种情况下是不会执行onSaveInstanceState的，因为这个activity不可能存在需要重建的操作
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
//        savedInstanceState.putInt(STATE_SCORE, mCurrentScore);
//        savedInstanceState.putInt(STATE_LEVEL, mCurrentLevel);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }
//    由于 onCreate() 方法会在第一次创建新的Activity实例与重新创建之前被Destory的实例时都被调用，我们必须在尝试读取 Bundle
//    对象前检测它是否为null。如果它为null，系统则是创建一个新的Activity实例，而不是恢复之前被Destory的Activity。
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
//        super.onRestoreInstanceState(savedInstanceState);
//
//        // Restore state members from saved instance
//        mCurrentScore = savedInstanceState.getInt(STATE_SCORE);
//        mCurrentLevel = savedInstanceState.getInt(STATE_LEVEL);
    }
}
