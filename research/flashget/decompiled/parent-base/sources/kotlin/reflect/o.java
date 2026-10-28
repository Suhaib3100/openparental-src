package kotlin.reflect;

import kotlin.Metadata;
import kotlin.c1;

/* compiled from: KProperty.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000f\u0010R\u001a\u0010\u0004\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0007\u001a\u0004\b\b\u0010\u0005R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n8&X¦\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/o;", "V", "Lkotlin/reflect/c;", "", "isLateinit", "()Z", "isLateinit$annotations", "()V", "isConst", "isConst$annotations", "Lkotlin/reflect/o$c;", "getGetter", "()Lkotlin/reflect/o$c;", "getGetter$annotations", "getter", "a", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface o<V> extends kotlin.reflect.c<V> {

    /* compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/o$a;", "V", "", "Lkotlin/reflect/o;", "l", "()Lkotlin/reflect/o;", "property", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<V> {
        @fg.l
        o<V> l();
    }

    /* compiled from: KProperty.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void b() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    /* compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/o$c;", "V", "Lkotlin/reflect/o$a;", "Lkotlin/reflect/i;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<V> extends a<V>, i<V> {
    }

    @fg.l
    c<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
