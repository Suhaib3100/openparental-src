package androidx.view.result;

import b.a;
import kotlin.Metadata;
import kotlin.k2;
import ld.l;

/* compiled from: ActivityResultCaller.kt */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"I", "O", "Landroidx/activity/result/b;", "Lb/a;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "Lkotlin/k2;", "callback", "Landroidx/activity/result/h;", "c", "(Landroidx/activity/result/b;Lb/a;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lld/l;)Landroidx/activity/result/h;", "d", "(Landroidx/activity/result/b;Lb/a;Ljava/lang/Object;Lld/l;)Landroidx/activity/result/h;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static void a(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void b(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @fg.l
    public static final <I, O> h<k2> c(@fg.l b bVar, @fg.l a<I, O> aVar, I i4, @fg.l ActivityResultRegistry activityResultRegistry, @fg.l final l<? super O, k2> lVar) {
        return new f(bVar.registerForActivityResult(aVar, activityResultRegistry, new a() { // from class: androidx.activity.result.c
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                l.this.invoke(obj);
            }
        }), aVar, i4);
    }

    @fg.l
    public static final <I, O> h<k2> d(@fg.l b bVar, @fg.l a<I, O> aVar, I i4, @fg.l final l<? super O, k2> lVar) {
        return new f(bVar.registerForActivityResult(aVar, new a() { // from class: androidx.activity.result.d
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                l.this.invoke(obj);
            }
        }), aVar, i4);
    }

    private static final void e(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    private static final void f(l lVar, Object obj) {
        lVar.invoke(obj);
    }
}
