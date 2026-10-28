package com.lxj.easyadapter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ItemDelegate.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/lxj/easyadapter/c;", "T", "", "", "N", "()I", "item", "position", "", "a", "(Ljava/lang/Object;I)Z", "Lcom/lxj/easyadapter/i;", "holder", "t", "Lkotlin/k2;", "b", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;I)V", "", "payloads", "c", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface c<T> {

    /* compiled from: ItemDelegate.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <T> void a(@l c<T> cVar, @l i iVar, T t4, int i4, @l List<? extends Object> list) {
            l0.p(cVar, ProtectedSandApp.s("\u1771\u0001"));
            l0.p(iVar, ProtectedSandApp.s("ᝲ\u0001"));
            l0.p(list, ProtectedSandApp.s("ᝳ\u0001"));
            cVar.b(iVar, t4, i4);
        }
    }

    int N();

    boolean a(T item, int position);

    void b(@l i holder, T t4, int position);

    void c(@l i holder, T t4, int position, @l List<? extends Object> payloads);
}
