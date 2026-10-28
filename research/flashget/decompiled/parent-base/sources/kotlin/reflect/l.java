package kotlin.reflect;

import kotlin.Metadata;
import kotlin.k2;
import kotlin.reflect.j;

/* compiled from: KProperty.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0010J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8&X¦\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/l;", "T", "V", "Lkotlin/reflect/q;", "Lkotlin/reflect/j;", "receiver", "value", "Lkotlin/k2;", "G", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/l$b;", "getSetter", "()Lkotlin/reflect/l$b;", "getSetter$annotations", "()V", "setter", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface l<T, V> extends q<T, V>, j<V> {

    /* compiled from: KProperty.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    /* compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/l$b;", "T", "V", "Lkotlin/reflect/j$b;", "Lkotlin/Function2;", "Lkotlin/k2;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b<T, V> extends j.b<V>, ld.p<T, V, k2> {
    }

    void G(T receiver, V value);

    @Override // kotlin.reflect.j
    @fg.l
    b<T, V> getSetter();
}
