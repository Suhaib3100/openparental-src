package androidx.room;

import android.content.Context;
import androidx.annotation.c1;
import androidx.room.c2;
import kotlin.Metadata;

/* compiled from: Room.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/room/b2;", "", "<init>", "()V", "T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/room/c2;", "Landroid/content/Context;", "context", "Landroidx/room/c2$a;", "c", "(Landroid/content/Context;Ljava/lang/Class;)Landroidx/room/c2$a;", "name", "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/c2$a;", "Ljava/lang/String;", "LOG_TAG", "MASTER_TABLE_NAME", "d", "CURSOR_CONV_SUFFIX", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String LOG_TAG = "ROOM";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String MASTER_TABLE_NAME = "room_master_table";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final b2 f33522a = new b2();

    private b2() {
    }

    @fg.l
    @kd.n
    public static final <T extends c2> c2.a<T> a(@fg.l Context context, @fg.l Class<T> klass, @fg.m String name) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(klass, "klass");
        if (name == null || kotlin.text.v.S1(name)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new c2.a<>(context, klass, name);
    }

    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static final <T, C> T b(@fg.l Class<C> klass, @fg.l String suffix) {
        String str;
        kotlin.jvm.internal.l0.p(klass, "klass");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        Package r02 = klass.getPackage();
        kotlin.jvm.internal.l0.m(r02);
        String fullPackage = r02.getName();
        String canonicalName = klass.getCanonicalName();
        kotlin.jvm.internal.l0.m(canonicalName);
        kotlin.jvm.internal.l0.o(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.l0.o(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String a5 = android.support.v4.media.c.a(new StringBuilder(), kotlin.text.v.h2(canonicalName, '.', '_', false, 4, null), suffix);
        try {
            if (fullPackage.length() == 0) {
                str = a5;
            } else {
                str = fullPackage + '.' + a5;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            kotlin.jvm.internal.l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + a5 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    @fg.l
    @kd.n
    public static final <T extends c2> c2.a<T> c(@fg.l Context context, @fg.l Class<T> klass) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(klass, "klass");
        return new c2.a<>(context, klass, null);
    }
}
