package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.c1;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(api = 28)
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        Object a();
    }

    static <T> T a(T t5) {
        T t6;
        return (!(t5 instanceof a) || (t6 = (T) ((a) t5).a()) == null) ? t5 : t6;
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.o0
    public Activity instantiateActivity(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.o0
    public Application instantiateApplication(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.o0
    public ContentProvider instantiateProvider(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.o0
    public BroadcastReceiver instantiateReceiver(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.o0
    public Service instantiateService(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
