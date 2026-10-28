package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AppComponentFactory.java */
@androidx.annotation.x0(28)
/* loaded from: classes3.dex */
public class h extends AppComponentFactory {
    @androidx.annotation.o0
    public Activity a(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.o0
    public Application b(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.o0
    public ContentProvider c(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.o0
    public BroadcastReceiver d(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.o0
    public Service e(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.o0
    public final Activity instantiateActivity(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @androidx.annotation.o0
    public final Application instantiateApplication(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @androidx.annotation.o0
    public final ContentProvider instantiateProvider(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @androidx.annotation.o0
    public final BroadcastReceiver instantiateReceiver(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @androidx.annotation.o0
    public final Service instantiateService(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str, @androidx.annotation.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}
