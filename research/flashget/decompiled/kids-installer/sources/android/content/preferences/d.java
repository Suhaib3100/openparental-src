package android.content.preferences;

import android.content.core.CorruptionException;
import android.content.preferences.e;
import android.content.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: PreferencesMapCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/d;", "", "<init>", "()V", "a", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: PreferencesMapCompat.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Landroidx/datastore/preferences/d$a;", "", "Ljava/io/InputStream;", "input", "Landroidx/datastore/preferences/e$b;", "a", "<init>", "()V", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.preferences.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final e.b a(@d5.d InputStream input) {
            l0.p(input, "input");
            try {
                e.b X2 = e.b.X2(input);
                l0.o(X2, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return X2;
            } catch (InvalidProtocolBufferException e6) {
                throw new CorruptionException("Unable to parse preferences proto.", e6);
            }
        }

        public Companion(w wVar) {
        }
    }
}
