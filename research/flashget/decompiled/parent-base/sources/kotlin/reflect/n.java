package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* compiled from: KParameter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/n;", "Lkotlin/reflect/b;", "", "getIndex", "()I", "index", "", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/s;", "getType", "()Lkotlin/reflect/s;", "type", "Lkotlin/reflect/n$b;", "b", "()Lkotlin/reflect/n$b;", "kind", "", "A", "()Z", "isOptional", "a", "isVararg$annotations", "()V", "isVararg", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface n extends kotlin.reflect.b {

    /* compiled from: KParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @c1(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/n$b;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b INSTANCE = new b(ProtectedSandApp.s("芶\u0001"), 0);
        public static final b EXTENSION_RECEIVER = new b(ProtectedSandApp.s("芷\u0001"), 1);
        public static final b VALUE = new b(ProtectedSandApp.s("芸\u0001"), 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private b(String str, int i4) {
        }

        @fg.l
        public static kotlin.enums.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    boolean A();

    boolean a();

    @fg.l
    b b();

    int getIndex();

    @fg.m
    String getName();

    @fg.l
    s getType();
}
