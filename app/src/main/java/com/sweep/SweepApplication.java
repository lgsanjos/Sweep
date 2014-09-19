package com.sweep;

import android.app.Application;
import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by ganjos on 9/19/14.
 */
public class SweepApplication  extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        Object[] modules = getModules().toArray();
        objectGraph = ObjectGraph.create(modules);
    }

    protected List<Object> getModules() {
        return Arrays.<Object>asList(
                new SweepModule(this)
        );
    }

    public ObjectGraph getObjectGraph() {
        return this.objectGraph;
    }
}
