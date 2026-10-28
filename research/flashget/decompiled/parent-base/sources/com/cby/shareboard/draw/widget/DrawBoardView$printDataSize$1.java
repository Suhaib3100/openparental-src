package com.cby.shareboard.draw.widget;

import androidx.constraintlayout.widget.e;
import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: DrawBoardView.kt */
@f(c = "com.cby.shareboard.draw.widget.DrawBoardView$printDataSize$1", f = "DrawBoardView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DrawBoardView$printDataSize$1 extends o implements p<r0, d<? super k2>, Object> {
    final /* synthetic */ String $input;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ DrawBoardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawBoardView$printDataSize$1(String str, DrawBoardView drawBoardView, String str2, d<? super DrawBoardView$printDataSize$1> dVar) {
        super(2, dVar);
        this.$input = str;
        this.this$0 = drawBoardView;
        this.$source = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<k2> create(@m Object obj, @l d<?> dVar) {
        return new DrawBoardView$printDataSize$1(this.$input, this.this$0, this.$source, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ஐ"));
        }
        a1.n(obj);
        byte[] bytes = this.$input.getBytes(kotlin.text.f.UTF_8);
        l0.o(bytes, ProtectedSandApp.s("ஊ"));
        int length = bytes.length;
        float f4 = length / 1024.0f;
        LogUtils logger = this.this$0.getLogger();
        StringBuilder a5 = e.a(ProtectedSandApp.s("\u0b8b"), this.$source, ProtectedSandApp.s("\u0b8c"), length, ProtectedSandApp.s("\u0b8d"));
        a5.append(f4);
        a5.append(ProtectedSandApp.s("எ"));
        a5.append(f4 / 1024.0f);
        a5.append(ProtectedSandApp.s("ஏ"));
        logger.debug(a5.toString());
        return k2.f75408a;
    }

    @Override // ld.p
    @m
    public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
        return ((DrawBoardView$printDataSize$1) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
    }
}
