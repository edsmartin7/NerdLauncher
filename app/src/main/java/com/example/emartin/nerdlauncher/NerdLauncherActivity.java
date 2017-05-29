package com.example.emartin.nerdlauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//TO DO
//add recyclerview dependency

//LINKS
//recyclverview
//https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html
//https://developer.android.com/guide/topics/ui/layout/recyclerview.html
//https://developer.android.com/training/material/lists-cards.html
//logcat
//https://developer.android.com/studio/debug/am-logcat.html


//extends SingleFragmentActivity
public class NerdLauncherActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return NerdLauncherFragment.newInstance();
    }

}

//ERRORS
//R. not showing
//https://stackoverflow.com/questions/17421104/android-studio-marks-r-in-red-with-error-message-cannot-resolve-symbol-r-but
//add most updated dependencies
//https://stackoverflow.com/questions/37612348/how-to-add-the-recyclerview-in-android-studio
//override methods shortcut
//https://stackoverflow.com/questions/26574277/how-to-override-method-via-keyboard-shortcut-in-android-studio
//proper gitignore
//https://github.com/github/gitignore
//https://stackoverflow.com/questions/16736856/what-should-be-in-my-gitignore-for-an-android-studio-project
//git line separators (auto fixed)
//https://help.github.com/articles/dealing-with-line-endings/
//android studio and git
//https://www.coursera.org/learn/internet-of-things-dragonboard/lecture/MaU6e/a-look-back-at-lesson-3

