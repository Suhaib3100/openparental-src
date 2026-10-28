package androidx.content.preferences;

import androidx.content.core.CorruptionException;
import androidx.content.preferences.e;
import androidx.content.preferences.protobuf.InvalidProtocolBufferException;
import fg.l;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: PreferencesMapCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/d;", "", "<init>", "()V", "a", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: PreferencesMapCompat.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/datastore/preferences/d$a;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "Landroidx/datastore/preferences/e$b;", "a", "(Ljava/io/InputStream;)Landroidx/datastore/preferences/e$b;", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.preferences.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final e.b a(@l InputStream input) {
            l0.p(input, "input");
            try {
                e.b W2 = e.b.W2(input);
                l0.o(W2, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return W2;
            } catch (InvalidProtocolBufferException e4) {
                throw new CorruptionException("Unable to parse preferences proto.", e4);
            }
        }

        public Companion(w wVar) {
        }
    }
}
