package androidx.content.preferences.core;

import androidx.content.preferences.core.d;
import fg.l;
import java.util.Arrays;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PreferencesFactory.kt */
@i(name = "PreferencesFactory")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0006\u001a\u00020\u00002\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\t\u001a\u00020\b2\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/preferences/core/d;", "b", "()Landroidx/datastore/preferences/core/d;", "", "Landroidx/datastore/preferences/core/d$b;", "pairs", "a", "([Landroidx/datastore/preferences/core/d$b;)Landroidx/datastore/preferences/core/d;", "Landroidx/datastore/preferences/core/a;", "c", "([Landroidx/datastore/preferences/core/d$b;)Landroidx/datastore/preferences/core/a;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class e {
    @l
    @i(name = "create")
    public static final d a(@l d.b<?>... pairs) {
        l0.p(pairs, "pairs");
        return c((d.b[]) Arrays.copyOf(pairs, pairs.length));
    }

    @l
    @i(name = "createEmpty")
    public static final d b() {
        return new a(null, true, 1, null);
    }

    @l
    @i(name = "createMutable")
    public static final a c(@l d.b<?>... pairs) {
        l0.p(pairs, "pairs");
        a aVar = new a(null, false, 1, null);
        aVar.m((d.b[]) Arrays.copyOf(pairs, pairs.length));
        return aVar;
    }
}
