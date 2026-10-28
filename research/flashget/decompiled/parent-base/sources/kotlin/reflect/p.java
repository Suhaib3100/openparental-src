package kotlin.reflect;

import kotlin.Metadata;
import kotlin.c1;
import kotlin.reflect.o;

/* compiled from: KProperty.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000eJ\u000f\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0007\u0010\u0005R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8&X¦\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/p;", "V", "Lkotlin/reflect/o;", "Lkotlin/Function0;", "get", "()Ljava/lang/Object;", "", "getDelegate", "Lkotlin/reflect/p$b;", "getGetter", "()Lkotlin/reflect/p$b;", "getGetter$annotations", "()V", "getter", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface p<V> extends o<V>, ld.a<V> {

    /* compiled from: KProperty.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    /* compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/p$b;", "V", "Lkotlin/reflect/o$c;", "Lkotlin/Function0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b<V> extends o.c<V>, ld.a<V> {
    }

    V get();

    @fg.m
    @c1(version = "1.1")
    Object getDelegate();

    @Override // kotlin.reflect.o
    @fg.l
    b<V> getGetter();
}
