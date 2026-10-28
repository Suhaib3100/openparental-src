package com.google.maps.android.compose;

import androidx.annotation.c1;
import androidx.compose.ui.platform.AbstractComposeView;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: MapComposeViewRender.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/maps/android/compose/h;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "onAddedToWindow", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;Lld/a;)V", "Lcom/google/maps/android/compose/h$a;", "b", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lcom/google/maps/android/compose/h$a;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface h {

    /* compiled from: MapComposeViewRender.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/google/maps/android/compose/h$a;", "Ljava/io/Closeable;", "Lkotlin/k2;", "dispose", "()V", "close", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends Closeable {

        /* compiled from: MapComposeViewRender.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.google.maps.android.compose.h$a$a, reason: collision with other inner class name */
        public static final class C0949a {
            public static void a(@fg.l a aVar) {
                aVar.dispose();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void dispose();
    }

    void a(@fg.l AbstractComposeView view, @fg.m ld.a<k2> onAddedToWindow);

    @fg.l
    a b(@fg.l AbstractComposeView view);
}
