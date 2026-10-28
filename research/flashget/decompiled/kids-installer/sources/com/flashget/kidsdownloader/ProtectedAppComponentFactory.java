package com.flashget.kidsdownloader;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public class ProtectedAppComponentFactory extends AppComponentFactory {
    private AppComponentFactory factory;

    private AppComponentFactory getAppComponentFactory() {
        AppComponentFactory appComponentFactory = this.factory;
        if (appComponentFactory != null) {
            return appComponentFactory;
        }
        String processName = Application.getProcessName();
        if (processName == null || !(processName.contains(":p85e2d0ac55e7d43a61593762") || processName.contains(":p58d42775efa8acc53298bfa4"))) {
            try {
                this.factory = (AppComponentFactory) Class.forName("androidx.core.app.CoreComponentFactory").newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
                if (!Process.isIsolated()) {
                    Log.e("LoadedApk", "Unable to instantiate appComponentFactory", e6);
                }
                this.factory = new AppComponentFactory();
            }
            return this.factory;
        }
        Log.i("LoadedApk", "Fast path. Process name: " + processName);
        AppComponentFactory appComponentFactory2 = new AppComponentFactory();
        this.factory = appComponentFactory2;
        return appComponentFactory2;
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return getAppComponentFactory().instantiateActivity(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) classLoader.loadClass(str).newInstance();
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return getAppComponentFactory().instantiateProvider(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return getAppComponentFactory().instantiateReceiver(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return getAppComponentFactory().instantiateService(classLoader, str, intent);
    }
}
