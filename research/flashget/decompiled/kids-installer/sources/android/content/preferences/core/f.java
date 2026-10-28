package android.content.preferences.core;

import android.content.preferences.core.d;
import d5.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import p3.i;

/* compiled from: PreferencesKeys.kt */
@i(name = "PreferencesKeys")
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0005\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0005\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u0005\u001a#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u000f0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"", "name", "Landroidx/datastore/preferences/core/d$a;", "", "d", "(Ljava/lang/String;)Landroidx/datastore/preferences/core/d$a;", "", "b", "f", "", "a", "", "c", "", "e", "", "g", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class f {
    @i(name = "booleanKey")
    @d
    public static final d.a<Boolean> a(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }

    @i(name = "doubleKey")
    @d5.d
    public static final d.a<Double> b(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }

    @i(name = "floatKey")
    @d5.d
    public static final d.a<Float> c(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }

    @i(name = "intKey")
    @d5.d
    public static final d.a<Integer> d(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }

    @i(name = "longKey")
    @d5.d
    public static final d.a<Long> e(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }

    @i(name = "stringKey")
    @d5.d
    public static final d.a<String> f(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }

    @i(name = "stringSetKey")
    @d5.d
    public static final d.a<Set<String>> g(@d5.d String name) {
        l0.p(name, "name");
        return new d.a<>(name);
    }
}
