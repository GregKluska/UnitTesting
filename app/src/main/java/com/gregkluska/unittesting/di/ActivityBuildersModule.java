package com.gregkluska.unittesting.di;

import com.gregkluska.unittesting.ui.noteslist.NotesListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract NotesListActivity contributeNotesListActivity();
}
