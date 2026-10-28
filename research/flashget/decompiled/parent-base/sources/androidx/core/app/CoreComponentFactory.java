package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.c1;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(api = 28)
/* loaded from: classes3.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        Object a();
    }

    static <T> T a(T t4) {
        T t5;
        return (!(t4 instanceof a) || (t5 = (T) ((a) t4).a()) == null) ? t4 : t5;
    }

    @androidx.annotation.o0
    public Activity instantiateActivity(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @androidx.annotation.o0
    public Application instantiateApplication(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @androidx.annotation.o0
    public ContentProvider instantiateProvider(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @androidx.annotation.o0
    public BroadcastReceiver instantiateReceiver(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @androidx.annotation.o0
    public Service instantiateService(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
