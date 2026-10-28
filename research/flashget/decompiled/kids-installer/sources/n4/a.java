package n4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheImplementation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "(Ljava/lang/String;I)V", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "Companion", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @d
    public static final Companion INSTANCE;

    @d
    private static final a DEFAULT;
    public static final a HASH_MAP;
    public static final a NO_CACHE;
    public static final a SPARSE_ARRAY = new a(ProtectedSandApp.s("庲"), 0);

    /* compiled from: CacheImplementation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "()V", "DEFAULT", "Lkotlinx/android/extensions/CacheImplementation;", "getDEFAULT", "()Lkotlinx/android/extensions/CacheImplementation;", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n4.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d
        public final a a() {
            return a.DEFAULT;
        }

        public Companion(w wVar) {
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{SPARSE_ARRAY, HASH_MAP, NO_CACHE};
    }

    static {
        a aVar = new a(ProtectedSandApp.s("庳"), 1);
        HASH_MAP = aVar;
        NO_CACHE = new a(ProtectedSandApp.s("庴"), 2);
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        INSTANCE = new Companion(null);
        DEFAULT = aVar;
    }

    private a(String str, int i5) {
    }

    @d
    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
