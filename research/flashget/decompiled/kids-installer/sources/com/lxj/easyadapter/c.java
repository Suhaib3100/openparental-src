package com.lxj.easyadapter;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ItemDelegate.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/lxj/easyadapter/c;", "T", "", "", "a", "item", "position", "", "b", "(Ljava/lang/Object;I)Z", "Lcom/lxj/easyadapter/i;", "holder", "t", "Lkotlin/m2;", "c", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;I)V", "", "payloads", "d", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface c<T> {

    /* compiled from: ItemDelegate.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <T> void a(@d5.d c<T> cVar, @d5.d i iVar, T t5, int i5, @d5.d List<? extends Object> list) {
            l0.p(cVar, ProtectedSandApp.s("㓈"));
            l0.p(iVar, ProtectedSandApp.s("㓉"));
            l0.p(list, ProtectedSandApp.s("㓊"));
            cVar.c(iVar, t5, i5);
        }
    }

    int a();

    boolean b(T item, int position);

    void c(@d5.d i holder, T t5, int position);

    void d(@d5.d i holder, T t5, int position, @d5.d List<? extends Object> payloads);
}
