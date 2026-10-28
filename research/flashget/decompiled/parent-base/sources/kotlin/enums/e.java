package kotlin.enums;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: EnumEntriesSerializationProxy.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\nB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/enums/e;", "", "E", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "a", "()Ljava/lang/Object;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e<E extends Enum<E>> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final a f75089c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final long f75090d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Class<E> c;

    /* compiled from: EnumEntriesSerializationProxy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/enums/e$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public e(@l E[] eArr) {
        l0.p(eArr, ProtectedSandApp.s("捒\u0001"));
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        l0.m(cls);
        this.c = cls;
    }

    private final Object a() {
        E[] enumConstants = this.c.getEnumConstants();
        l0.o(enumConstants, ProtectedSandApp.s("捓\u0001"));
        return c.c(enumConstants);
    }
}
