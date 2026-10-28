package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import com.luck.picture.lib.config.PictureConfig;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0081\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0081\u0001\u0010\u0014\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0081\u0001\u0010\u0015\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u0083\u0001\u0010\u001f\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u008f\u0001\u0010\"\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001al\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001ax\u0010'\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010!2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a-\u0010.\u001a\u00020-2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b.\u0010/\u001a-\u00101\u001a\u0002002\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b1\u00102\u001a'\u00103\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b3\u00104\u001a@\u0010<\u001a\u00020;2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020)2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020)\u0018\u0001072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020)\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=\u001a\u0087\u0001\u0010B\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\bB\u0010C\u001aµ\u0001\u0010I\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010D\u001a\u00020\u001b2\u0011\u0010E\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010F\u001a\u00020>2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a£\u0001\u0010V\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u00182\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010?\u001a\u00020>2\u0006\u0010O\u001a\u00020)2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u0006\u0010D\u001a\u00020T2\u0006\u0010U\u001a\u00020@2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a@\u0010X\u001a\u00020;2\u0006\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020)2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020)\u0018\u0001072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020)\u0018\u000109H\u0082@¢\u0006\u0004\bX\u0010Y\"\u0014\u0010[\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010Z\"\u001a\u0010^\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\b\\\u0010]\"\u0014\u0010_\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010Z\"\u0014\u0010`\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010Z\"\u001a\u0010e\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010b\u001a\u0004\bc\u0010d\"\u0014\u0010f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010Z\"\u0014\u0010g\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010Z\"\u0014\u0010h\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010Z\"\u0014\u0010i\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k²\u0006\f\u0010j\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "title", "Landroidx/compose/ui/q;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x1;", "Lkotlin/u;", "actions", "Landroidx/compose/foundation/layout/n2;", "windowInsets", "Landroidx/compose/material3/mb;", "colors", "Landroidx/compose/material3/ob;", "scrollBehavior", "l", "(Lld/p;Landroidx/compose/ui/q;Lld/p;Lld/q;Landroidx/compose/foundation/layout/n2;Landroidx/compose/material3/mb;Landroidx/compose/material3/ob;Landroidx/compose/runtime/t;II)V", "k", "f", "h", "g", "floatingActionButton", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/h;", "tonalElevation", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "b", "(Lld/q;Landroidx/compose/ui/q;Lld/p;JJFLandroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/layout/n2;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/f0;", "d", "(Lld/q;Landroidx/compose/ui/q;Lld/p;JJFLandroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/layout/n2;Landroidx/compose/material3/f0;Landroidx/compose/runtime/t;II)V", "content", "a", "(Landroidx/compose/ui/q;JJFLandroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/layout/n2;Lld/q;Landroidx/compose/runtime/t;II)V", "c", "(Landroidx/compose/ui/q;JJFLandroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/layout/n2;Landroidx/compose/material3/f0;Lld/q;Landroidx/compose/runtime/t;II)V", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "Landroidx/compose/material3/pb;", "A", "(FFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/pb;", "Landroidx/compose/material3/g0;", "z", "(FFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/g0;", "e", "(FFF)Landroidx/compose/material3/g0;", "state", "velocity", "Landroidx/compose/animation/core/z;", "flingAnimationSpec", "Landroidx/compose/animation/core/k;", "snapAnimationSpec", "Landroidx/compose/ui/unit/c0;", "C", "(Landroidx/compose/material3/g0;FLandroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/v0;", "titleTextStyle", "", "centeredTitle", "i", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/ui/text/v0;ZLld/p;Lld/q;Landroidx/compose/foundation/layout/n2;Landroidx/compose/material3/mb;Landroidx/compose/material3/ob;Landroidx/compose/runtime/t;II)V", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "maxHeight", "pinnedHeight", "n", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/ui/text/v0;FLld/p;Landroidx/compose/ui/text/v0;Lld/p;Lld/q;Landroidx/compose/foundation/layout/n2;Landroidx/compose/material3/mb;FFLandroidx/compose/material3/ob;Landroidx/compose/runtime/t;III)V", "heightPx", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "Landroidx/compose/foundation/layout/i$m;", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/i$e;", "titleHorizontalArrangement", "", "hideTitleSemantics", "m", "(Landroidx/compose/ui/q;FJJJLld/p;Landroidx/compose/ui/text/v0;FLandroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;IZLld/p;Lld/p;Landroidx/compose/runtime/t;II)V", "B", "(Landroidx/compose/material3/pb;FLandroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "F", "BottomAppBarHorizontalPadding", "x", "()F", "BottomAppBarVerticalPadding", "FABHorizontalPadding", "FABVerticalPadding", "Landroidx/compose/animation/core/x;", "Landroidx/compose/animation/core/x;", "y", "()Landroidx/compose/animation/core/x;", "TopTitleAlphaEasing", "MediumTitleBottomPadding", "LargeTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2283:1\n1116#2,6:2284\n1116#2,6:2290\n1116#2,6:2296\n1116#2,6:2302\n1116#2,6:2308\n1116#2,6:2316\n1116#2,6:2322\n1116#2,6:2328\n1116#2,6:2335\n1116#2,6:2341\n1116#2,6:2347\n1116#2,6:2353\n74#3:2314\n74#3:2334\n1#4:2315\n78#5,11:2359\n78#5,11:2393\n91#5:2425\n78#5,11:2433\n91#5:2465\n78#5,11:2473\n91#5:2505\n91#5:2510\n456#6,8:2370\n464#6,3:2384\n456#6,8:2404\n464#6,3:2418\n467#6,3:2422\n456#6,8:2444\n464#6,3:2458\n467#6,3:2462\n456#6,8:2484\n464#6,3:2498\n467#6,3:2502\n467#6,3:2507\n3737#7,6:2378\n3737#7,6:2412\n3737#7,6:2452\n3737#7,6:2492\n68#8,6:2387\n74#8:2421\n78#8:2426\n68#8,6:2427\n74#8:2461\n78#8:2466\n68#8,6:2467\n74#8:2501\n78#8:2506\n81#9:2511\n154#10:2512\n154#10:2514\n154#10:2516\n154#10:2518\n154#10:2520\n154#10:2521\n154#10:2522\n154#10:2523\n58#11:2513\n58#11:2515\n58#11:2517\n58#11:2519\n58#11:2524\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n*L\n590#1:2284,6\n593#1:2290,6\n616#1:2296,6\n1053#1:2302,6\n1374#1:2308,6\n1641#1:2316,6\n1671#1:2322,6\n1674#1:2328,6\n1759#1:2335,6\n1792#1:2341,6\n1795#1:2347,6\n1937#1:2353,6\n1640#1:2314\n1751#1:2334\n1901#1:2359,11\n1903#1:2393,11\n1903#1:2425\n1913#1:2433,11\n1913#1:2465\n1925#1:2473,11\n1925#1:2505\n1901#1:2510\n1901#1:2370,8\n1901#1:2384,3\n1903#1:2404,8\n1903#1:2418,3\n1903#1:2422,3\n1913#1:2444,8\n1913#1:2458,3\n1913#1:2462,3\n1925#1:2484,8\n1925#1:2498,3\n1925#1:2502,3\n1901#1:2507,3\n1901#1:2378,6\n1903#1:2412,6\n1913#1:2452,6\n1925#1:2492,6\n1903#1:2387,6\n1903#1:2421\n1903#1:2426\n1913#1:2427,6\n1913#1:2461\n1913#1:2466\n1925#1:2467,6\n1925#1:2501\n1925#1:2506\n1653#1:2511\n1609#1:2512\n1610#1:2514\n1613#1:2516\n1614#1:2518\n2276#1:2520\n2277#1:2521\n2278#1:2522\n2282#1:2523\n1609#1:2513\n1610#1:2515\n1613#1:2517\n1614#1:2519\n2282#1:2524\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12961a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f12962b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f12963c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f12964d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f12965e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f12966f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f12967g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f12968h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f12969i;

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f12970b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12971c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12972d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12973e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12974f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f12975g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f12976h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12977i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12978j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12979k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, long j4, long j5, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.layout.n2 n2Var, int i4, int i5) {
            super(2);
            this.f12970b = qVar;
            this.f12971c = qVar2;
            this.f12972d = pVar;
            this.f12973e = j4;
            this.f12974f = j5;
            this.f12975g = f4;
            this.f12976h = l1Var;
            this.f12977i = n2Var;
            this.f12978j = i4;
            this.f12979k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.b(this.f12970b, this.f12971c, this.f12972d, this.f12973e, this.f12974f, this.f12975g, this.f12976h, this.f12977i, tVar, androidx.compose.runtime.g3.b(this.f12978j | 1), this.f12979k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$actionsRow$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2283:1\n86#2,7:2284\n93#2:2319\n97#2:2324\n78#3,11:2291\n91#3:2323\n456#4,8:2302\n464#4,3:2316\n467#4,3:2320\n3737#5,6:2310\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$actionsRow$1\n*L\n1775#1:2284,7\n1775#1:2319\n1775#1:2324\n1775#1:2291,11\n1775#1:2323\n1775#1:2302,8\n1775#1:2316,3\n1775#1:2320,3\n1775#1:2310,6\n*E\n"})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f12980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12980b = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1048401111, i4, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1774)");
            }
            i.e h4 = androidx.compose.foundation.layout.i.f5073a.h();
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12980b;
            tVar.P(693286680);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(h4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.y1.f5410a, tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/x1;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/x1;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$BottomAppBar$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,2283:1\n91#2,2:2284\n93#2:2314\n97#2:2319\n78#3,11:2286\n91#3:2318\n78#3,11:2325\n91#3:2357\n456#4,8:2297\n464#4,3:2311\n467#4,3:2315\n456#4,8:2336\n464#4,3:2350\n467#4,3:2354\n3737#5,6:2305\n3737#5,6:2344\n69#6,5:2320\n74#6:2353\n78#6:2358\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$BottomAppBar$2\n*L\n478#1:2284,2\n478#1:2314\n478#1:2319\n478#1:2286,11\n478#1:2318\n485#1:2325,11\n485#1:2357\n478#1:2297,8\n478#1:2311,3\n478#1:2315,3\n485#1:2336,8\n485#1:2350,3\n485#1:2354,3\n478#1:2305,6\n485#1:2344,6\n485#1:2320,5\n485#1:2353\n485#1:2358\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f12981b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(3);
            this.f12981b = qVar;
            this.f12982c = pVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.foundation.layout.x1 x1Var, androidx.compose.runtime.t tVar, Integer num) {
            a(x1Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.layout.x1 x1Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 6) == 0) {
                i5 = i4 | (tVar.q0(x1Var) ? 4 : 2);
            } else {
                i5 = i4;
            }
            if ((i5 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1566394874, i5, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:477)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q e4 = androidx.compose.foundation.layout.x1.e(x1Var, companion, 1.0f, false, 2, null);
            i.e p4 = androidx.compose.foundation.layout.i.f5073a.p();
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            c.InterfaceC0326c q4 = companion2.q();
            ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12981b;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(p4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion3, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.y1.f5410a, tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (this.f12982c != null) {
                androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.d(companion, 0.0f, 1, null), 0.0f, p.f12964d, p.f12963c, 0.0f, 9, null);
                androidx.compose.ui.c C = companion2.C();
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12982c;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 i6 = androidx.compose.foundation.layout.m.i(C, false, tVar, 6);
                tVar.P(-1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B2 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a7 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(o4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a7);
                } else {
                    tVar.C();
                }
                ld.p a8 = androidx.compose.animation.p.a(companion3, tVar, i6, tVar, B2);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a8);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                androidx.compose.material3.q.a(0, pVar, tVar);
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.l<Float, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ob f12983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(ob obVar) {
            super(1);
            this.f12983b = obVar;
        }

        public final void a(float f4) {
            this.f12983b.getState().h(this.f12983b.getState().d() + f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4) {
            a(f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f12984b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12985c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12986d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12987e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12988f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f12989g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f12990h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12991i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.f0 f12992j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12993k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12994l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, long j4, long j5, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.layout.n2 n2Var, androidx.compose.material3.f0 f0Var, int i4, int i5) {
            super(2);
            this.f12984b = qVar;
            this.f12985c = qVar2;
            this.f12986d = pVar;
            this.f12987e = j4;
            this.f12988f = j5;
            this.f12989g = f4;
            this.f12990h = l1Var;
            this.f12991i = n2Var;
            this.f12992j = f0Var;
            this.f12993k = i4;
            this.f12994l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.d(this.f12984b, this.f12985c, this.f12986d, this.f12987e, this.f12988f, this.f12989g, this.f12990h, this.f12991i, this.f12992j, tVar, androidx.compose.runtime.g3.b(this.f12993k | 1), this.f12994l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {1796}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class c0 extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12995b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f12996c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ob f12997d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(ob obVar, kotlin.coroutines.d<? super c0> dVar) {
            super(3, dVar);
            this.f12997d = obVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            c0 c0Var = new c0(this.f12997d, dVar);
            c0Var.f12996c = f4;
            return c0Var.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12995b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                float f4 = this.f12996c;
                pb state = this.f12997d.getState();
                androidx.compose.animation.core.z<Float> c5 = this.f12997d.c();
                androidx.compose.animation.core.k<Float> d5 = this.f12997d.d();
                this.f12995b = 1;
                if (p.B(state, f4, c5, d5, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12998b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13000d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f13001e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13002f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13003g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13004h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13005i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13006j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.q qVar, long j4, long j5, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12998b = qVar;
            this.f12999c = j4;
            this.f13000d = j5;
            this.f13001e = f4;
            this.f13002f = l1Var;
            this.f13003g = n2Var;
            this.f13004h = qVar2;
            this.f13005i = i4;
            this.f13006j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.a(this.f12998b, this.f12999c, this.f13000d, this.f13001e, this.f13002f, this.f13003g, this.f13004h, tVar, androidx.compose.runtime.g3.b(this.f13005i | 1), this.f13006j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/g0;", "a", "()Landroidx/compose/material3/g0;"}, k = 3, mv = {1, 8, 0})
    static final class d0 extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.material3.g0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f13007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13009d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(float f4, float f5, float f6) {
            super(0);
            this.f13007b = f4;
            this.f13008c = f5;
            this.f13009d = f6;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.material3.g0 invoke() {
            return p.e(this.f13007b, this.f13008c, this.f13009d);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.f0 f13010b;

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13011b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var) {
                super(1);
                this.f13011b = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.g(aVar, this.f13011b, 0, 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.material3.f0 f0Var) {
            super(3);
            this.f13010b = f0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            androidx.compose.material3.g0 state;
            androidx.compose.material3.f0 f0Var = this.f13010b;
            androidx.compose.material3.g0 state2 = f0Var != null ? f0Var.getState() : null;
            if (state2 != null) {
                state2.g(-o0Var.v5(c0.c.f37060a.c()));
            }
            androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
            float height = m02.getHeight();
            androidx.compose.material3.f0 f0Var2 = this.f13010b;
            return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), kotlin.math.b.L0(height + ((f0Var2 == null || (state = f0Var2.getState()) == null) ? 0.0f : state.b())), null, new a(m02), 4, null);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/pb;", "a", "()Landroidx/compose/material3/pb;"}, k = 3, mv = {1, 8, 0})
    static final class e0 extends kotlin.jvm.internal.n0 implements ld.a<pb> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f13012b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13013c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(float f4, float f5, float f6) {
            super(0);
            this.f13012b = f4;
            this.f13013c = f5;
            this.f13014d = f6;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pb invoke() {
            return new pb(this.f13012b, this.f13013c, this.f13014d);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$BottomAppBar$6\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2283:1\n91#2,2:2284\n93#2:2314\n97#2:2319\n78#3,11:2286\n91#3:2318\n456#4,8:2297\n464#4,3:2311\n467#4,3:2315\n3737#5,6:2305\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$BottomAppBar$6\n*L\n630#1:2284,2\n630#1:2314\n630#1:2319\n630#1:2286,11\n630#1:2318\n630#1:2297,8\n630#1:2311,3\n630#1:2315,3\n630#1:2305,6\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13017d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.foundation.layout.n2 n2Var, androidx.compose.foundation.layout.l1 l1Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f13015b = n2Var;
            this.f13016c = l1Var;
            this.f13017d = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1243053520, i4, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:629)");
            }
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.i(androidx.compose.foundation.layout.d3.e(androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null), this.f13015b), c0.c.f37060a.c()), this.f13016c);
            i.e p4 = androidx.compose.foundation.layout.i.f5073a.p();
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f13017d;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(p4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar, j5, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.y1.f5410a, tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {2241, 2257}, m = "settleAppBar", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f13018b;

        /* renamed from: c, reason: collision with root package name */
        Object f13019c;

        /* renamed from: d, reason: collision with root package name */
        Object f13020d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f13021e;

        /* renamed from: f, reason: collision with root package name */
        int f13022f;

        f0(kotlin.coroutines.d<? super f0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f13021e = obj;
            this.f13022f |= Integer.MIN_VALUE;
            return p.B(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13025d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f13026e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13027f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13028g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.f0 f13029h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13030i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13031j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13032k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, long j4, long j5, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.layout.n2 n2Var, androidx.compose.material3.f0 f0Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13023b = qVar;
            this.f13024c = j4;
            this.f13025d = j5;
            this.f13026e = f4;
            this.f13027f = l1Var;
            this.f13028g = n2Var;
            this.f13029h = f0Var;
            this.f13030i = qVar2;
            this.f13031j = i4;
            this.f13032k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.c(this.f13023b, this.f13024c, this.f13025d, this.f13026e, this.f13027f, this.f13028g, this.f13029h, this.f13030i, tVar, androidx.compose.runtime.g3.b(this.f13031j | 1), this.f13032k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.e f13033b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pb f13034c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f13035d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(k1.e eVar, pb pbVar, k1.e eVar2) {
            super(1);
            this.f13033b = eVar;
            this.f13034c = pbVar;
            this.f13035d = eVar2;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            float floatValue = jVar.g().floatValue() - this.f13033b.f75326b;
            float d5 = this.f13034c.d();
            this.f13034c.h(d5 + floatValue);
            float abs = Math.abs(d5 - this.f13034c.d());
            this.f13033b.f75326b = jVar.g().floatValue();
            this.f13035d.f75326b = jVar.h().floatValue();
            if (Math.abs(floatValue - abs) > 0.5f) {
                jVar.a();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Float, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.f0 f13036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.material3.f0 f0Var) {
            super(1);
            this.f13036b = f0Var;
        }

        public final void a(float f4) {
            androidx.compose.material3.g0 state = this.f13036b.getState();
            state.f(state.b() - f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4) {
            a(f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class h0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ pb f13037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(pb pbVar) {
            super(1);
            this.f13037b = pbVar;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            this.f13037b.h(jVar.g().floatValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13038b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f13039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.f0 f13040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.material3.f0 f0Var, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.f13040d = f0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            i iVar = new i(this.f13040d, dVar);
            iVar.f13039c = f4;
            return iVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13038b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                float f4 = this.f13039c;
                androidx.compose.material3.g0 state = this.f13040d.getState();
                androidx.compose.animation.core.z<Float> c5 = this.f13040d.c();
                androidx.compose.animation.core.k<Float> d5 = this.f13040d.d();
                this.f13038b = 1;
                if (p.C(state, f4, c5, d5, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {1578, 1594}, m = "settleAppBarBottom", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f13041b;

        /* renamed from: c, reason: collision with root package name */
        Object f13042c;

        /* renamed from: d, reason: collision with root package name */
        Object f13043d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f13044e;

        /* renamed from: f, reason: collision with root package name */
        int f13045f;

        i0(kotlin.coroutines.d<? super i0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f13044e = obj;
            this.f13045f |= Integer.MIN_VALUE;
            return p.C(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13046b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13047c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13048d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13049e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13050f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mb f13051g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ob f13052h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13053i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13054j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, int i4, int i5) {
            super(2);
            this.f13046b = pVar;
            this.f13047c = qVar;
            this.f13048d = pVar2;
            this.f13049e = qVar2;
            this.f13050f = n2Var;
            this.f13051g = mbVar;
            this.f13052h = obVar;
            this.f13053i = i4;
            this.f13054j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.f(this.f13046b, this.f13047c, this.f13048d, this.f13049e, this.f13050f, this.f13051g, this.f13052h, tVar, androidx.compose.runtime.g3.b(this.f13053i | 1), this.f13054j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class j0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.e f13055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.g0 f13056c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f13057d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(k1.e eVar, androidx.compose.material3.g0 g0Var, k1.e eVar2) {
            super(1);
            this.f13055b = eVar;
            this.f13056c = g0Var;
            this.f13057d = eVar2;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            float floatValue = jVar.g().floatValue() - this.f13055b.f75326b;
            float b5 = this.f13056c.b();
            this.f13056c.f(b5 + floatValue);
            float abs = Math.abs(b5 - this.f13056c.b());
            this.f13055b.f75326b = jVar.g().floatValue();
            this.f13057d.f75326b = jVar.h().floatValue();
            if (Math.abs(floatValue - abs) > 0.5f) {
                jVar.a();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13059c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13060d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13061e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13062f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mb f13063g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ob f13064h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13065i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13066j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, int i4, int i5) {
            super(2);
            this.f13058b = pVar;
            this.f13059c = qVar;
            this.f13060d = pVar2;
            this.f13061e = qVar2;
            this.f13062f = n2Var;
            this.f13063g = mbVar;
            this.f13064h = obVar;
            this.f13065i = i4;
            this.f13066j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.g(this.f13058b, this.f13059c, this.f13060d, this.f13061e, this.f13062f, this.f13063g, this.f13064h, tVar, androidx.compose.runtime.g3.b(this.f13065i | 1), this.f13066j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.g0 f13067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(androidx.compose.material3.g0 g0Var) {
            super(1);
            this.f13067b = g0Var;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            this.f13067b.f(jVar.g().floatValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13068b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13069c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13070d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13071e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13072f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mb f13073g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ob f13074h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13075i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13076j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, int i4, int i5) {
            super(2);
            this.f13068b = pVar;
            this.f13069c = qVar;
            this.f13070d = pVar2;
            this.f13071e = qVar2;
            this.f13072f = n2Var;
            this.f13073g = mbVar;
            this.f13074h = obVar;
            this.f13075i = i4;
            this.f13076j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.h(this.f13068b, this.f13069c, this.f13070d, this.f13071e, this.f13072f, this.f13073g, this.f13074h, tVar, androidx.compose.runtime.g3.b(this.f13075i | 1), this.f13076j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ob f13077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13078c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ob obVar, float f4) {
            super(0);
            this.f13077b = obVar;
            this.f13078c = f4;
        }

        public final void a() {
            pb state;
            ob obVar = this.f13077b;
            if (kotlin.jvm.internal.l0.e((obVar == null || (state = obVar.getState()) == null) ? null : Float.valueOf(state.e()), this.f13078c)) {
                return;
            }
            ob obVar2 = this.f13077b;
            pb state2 = obVar2 != null ? obVar2.getState() : null;
            if (state2 == null) {
                return;
            }
            state2.i(this.f13078c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2283:1\n74#2:2284\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n*L\n1692#1:2284\n*E\n"})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13079b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mb f13080c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13081d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13082e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13083f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13084g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13085h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ob f13086i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ob obVar) {
            super(2);
            this.f13079b = n2Var;
            this.f13080c = mbVar;
            this.f13081d = pVar;
            this.f13082e = v0Var;
            this.f13083f = z4;
            this.f13084g = pVar2;
            this.f13085h = pVar3;
            this.f13086i = obVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            pb state;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(376925230, i4, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1691)");
            }
            Object x4 = tVar.x(androidx.compose.ui.platform.h1.i());
            ob obVar = this.f13086i;
            float v5 = ((androidx.compose.ui.unit.d) x4).v5(c0.o1.f37834a.c()) + ((obVar == null || (state = obVar.getState()) == null) ? 0.0f : state.d());
            androidx.compose.ui.q b5 = androidx.compose.ui.draw.h.b(androidx.compose.foundation.layout.d3.e(androidx.compose.ui.q.INSTANCE, this.f13079b));
            long navigationIconContentColor = this.f13080c.getNavigationIconContentColor();
            long titleContentColor = this.f13080c.getTitleContentColor();
            long actionIconContentColor = this.f13080c.getActionIconContentColor();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f13081d;
            androidx.compose.ui.text.v0 v0Var = this.f13082e;
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            p.m(b5, v5, navigationIconContentColor, titleContentColor, actionIconContentColor, pVar, v0Var, 1.0f, iVar.f(), this.f13083f ? iVar.f() : iVar.p(), 0, false, this.f13084g, this.f13085h, tVar, 113246208, 3126);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13090e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13091f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13092g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13093h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ mb f13094i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ob f13095j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13096k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13097l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, int i4, int i5) {
            super(2);
            this.f13087b = qVar;
            this.f13088c = pVar;
            this.f13089d = v0Var;
            this.f13090e = z4;
            this.f13091f = pVar2;
            this.f13092g = qVar2;
            this.f13093h = n2Var;
            this.f13094i = mbVar;
            this.f13095j = obVar;
            this.f13096k = i4;
            this.f13097l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.i(this.f13087b, this.f13088c, this.f13089d, this.f13090e, this.f13091f, this.f13092g, this.f13093h, this.f13094i, this.f13095j, tVar, androidx.compose.runtime.g3.b(this.f13096k | 1), this.f13097l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$actionsRow$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2283:1\n86#2,7:2284\n93#2:2319\n97#2:2324\n78#3,11:2291\n91#3:2323\n456#4,8:2302\n464#4,3:2316\n467#4,3:2320\n3737#5,6:2310\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$actionsRow$1\n*L\n1660#1:2284,7\n1660#1:2319\n1660#1:2324\n1660#1:2291,11\n1660#1:2323\n1660#1:2302,8\n1660#1:2316,3\n1660#1:2320,3\n1660#1:2310,6\n*E\n"})
    /* renamed from: androidx.compose.material3.p$p, reason: collision with other inner class name */
    static final class C0283p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0283p(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f13098b = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1520880938, i4, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1659)");
            }
            i.e h4 = androidx.compose.foundation.layout.i.f5073a.h();
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f13098b;
            tVar.P(693286680);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(h4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.y1.f5410a, tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<Float, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ob f13099b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(ob obVar) {
            super(1);
            this.f13099b = obVar;
        }

        public final void a(float f4) {
            this.f13099b.getState().h(this.f13099b.getState().d() + f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4) {
            a(f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {1675}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13100b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f13101c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ob f13102d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(ob obVar, kotlin.coroutines.d<? super r> dVar) {
            super(3, dVar);
            this.f13102d = obVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            r rVar = new r(this.f13102d, dVar);
            rVar.f13101c = f4;
            return rVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13100b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                float f4 = this.f13101c;
                pb state = this.f13102d.getState();
                androidx.compose.animation.core.z<Float> c5 = this.f13102d.c();
                androidx.compose.animation.core.k<Float> d5 = this.f13102d.d();
                this.f13100b = 1;
                if (p.B(state, f4, c5, d5, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13105d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13106e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13107f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mb f13108g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ob f13109h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13110i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13111j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, int i4, int i5) {
            super(2);
            this.f13103b = pVar;
            this.f13104c = qVar;
            this.f13105d = pVar2;
            this.f13106e = qVar2;
            this.f13107f = n2Var;
            this.f13108g = mbVar;
            this.f13109h = obVar;
            this.f13110i = i4;
            this.f13111j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.k(this.f13103b, this.f13104c, this.f13105d, this.f13106e, this.f13107f, this.f13108g, this.f13109h, tVar, androidx.compose.runtime.g3.b(this.f13110i | 1), this.f13111j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13113c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13114d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13115e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13116f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mb f13117g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ob f13118h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13119i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13120j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, int i4, int i5) {
            super(2);
            this.f13112b = pVar;
            this.f13113c = qVar;
            this.f13114d = pVar2;
            this.f13115e = qVar2;
            this.f13116f = n2Var;
            this.f13117g = mbVar;
            this.f13118h = obVar;
            this.f13119i = i4;
            this.f13120j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.l(this.f13112b, this.f13113c, this.f13114d, this.f13115e, this.f13116f, this.f13117g, this.f13118h, tVar, androidx.compose.runtime.g3.b(this.f13119i | 1), this.f13120j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class u extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f13121b = new u(1);

        u() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2283:1\n544#2,2:2284\n33#2,6:2286\n546#2:2292\n544#2,2:2293\n33#2,6:2295\n546#2:2301\n544#2,2:2302\n33#2,6:2304\n546#2:2310\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1\n*L\n1939#1:2284,2\n1939#1:2286,6\n1939#1:2292\n1942#1:2293,2\n1942#1:2295,6\n1942#1:2301\n1952#1:2302,2\n1952#1:2304,6\n1952#1:2310\n*E\n"})
    static final class v implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f13122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.e f13123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i.m f13124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13125d;

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13126b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f13127c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13128d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ i.e f13129e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f13130f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13131g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.o0 f13132h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ i.m f13133i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f13134j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f13135k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4, androidx.compose.ui.layout.i1 i1Var2, i.e eVar, long j4, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.o0 o0Var, i.m mVar, int i5, int i6) {
                super(1);
                this.f13126b = i1Var;
                this.f13127c = i4;
                this.f13128d = i1Var2;
                this.f13129e = eVar;
                this.f13130f = j4;
                this.f13131g = i1Var3;
                this.f13132h = o0Var;
                this.f13133i = mVar;
                this.f13134j = i5;
                this.f13135k = i6;
            }

            public final void a(@fg.l i1.a aVar) {
                int p4;
                int i4;
                int height;
                int max;
                int i5;
                int p5;
                androidx.compose.ui.layout.i1 i1Var = this.f13126b;
                i1.a.m(aVar, i1Var, 0, androidx.compose.material3.r.a(i1Var, this.f13127c, 2), 0.0f, 4, null);
                androidx.compose.ui.layout.i1 i1Var2 = this.f13128d;
                i.e eVar = this.f13129e;
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
                if (kotlin.jvm.internal.l0.g(eVar, iVar.f())) {
                    p4 = androidx.compose.material3.s.a(this.f13128d, androidx.compose.ui.unit.b.p(this.f13130f), 2);
                    if (p4 < this.f13126b.getWidth()) {
                        p5 = this.f13126b.getWidth() - p4;
                    } else if (this.f13128d.getWidth() + p4 > androidx.compose.ui.unit.b.p(this.f13130f) - this.f13131g.getWidth()) {
                        p5 = (androidx.compose.ui.unit.b.p(this.f13130f) - this.f13131g.getWidth()) - (this.f13128d.getWidth() + p4);
                    }
                    p4 += p5;
                } else {
                    p4 = kotlin.jvm.internal.l0.g(eVar, iVar.h()) ? (androidx.compose.ui.unit.b.p(this.f13130f) - this.f13128d.getWidth()) - this.f13131g.getWidth() : Math.max(this.f13132h.q2(p.f12969i), this.f13126b.getWidth());
                }
                int i6 = p4;
                i.m mVar = this.f13133i;
                if (kotlin.jvm.internal.l0.g(mVar, iVar.f())) {
                    i5 = androidx.compose.material3.r.a(this.f13128d, this.f13127c, 2);
                } else if (!kotlin.jvm.internal.l0.g(mVar, iVar.d())) {
                    i4 = 0;
                    i1.a.m(aVar, i1Var2, i6, i4, 0.0f, 4, null);
                    i1.a.m(aVar, this.f13131g, androidx.compose.ui.unit.b.p(this.f13130f) - this.f13131g.getWidth(), androidx.compose.material3.r.a(this.f13131g, this.f13127c, 2), 0.0f, 4, null);
                } else {
                    if (this.f13134j == 0) {
                        height = this.f13127c;
                        max = this.f13128d.getHeight();
                    } else {
                        height = this.f13127c - this.f13128d.getHeight();
                        max = Math.max(0, (this.f13134j - this.f13128d.getHeight()) + this.f13135k);
                    }
                    i5 = height - max;
                }
                i4 = i5;
                i1.a.m(aVar, i1Var2, i6, i4, 0.0f, 4, null);
                i1.a.m(aVar, this.f13131g, androidx.compose.ui.unit.b.p(this.f13130f) - this.f13131g.getWidth(), androidx.compose.material3.r.a(this.f13131g, this.f13127c, 2), 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        v(float f4, i.e eVar, i.m mVar, int i4) {
            this.f13122a = f4;
            this.f13123b = eVar;
            this.f13124c = mVar;
            this.f13125d = i4;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int p4;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "navigationIcon")) {
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 14, null));
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                        if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "actionIcons")) {
                            androidx.compose.ui.layout.i1 m03 = l0Var2.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 14, null));
                            if (androidx.compose.ui.unit.b.p(j4) == Integer.MAX_VALUE) {
                                p4 = androidx.compose.ui.unit.b.p(j4);
                            } else {
                                p4 = (androidx.compose.ui.unit.b.p(j4) - m02.getWidth()) - m03.getWidth();
                                if (p4 < 0) {
                                    p4 = 0;
                                }
                            }
                            int i6 = p4;
                            int size3 = list.size();
                            for (int i7 = 0; i7 < size3; i7++) {
                                androidx.compose.ui.layout.l0 l0Var3 = list.get(i7);
                                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var3), "title")) {
                                    androidx.compose.ui.layout.i1 m04 = l0Var3.m0(androidx.compose.ui.unit.b.e(j4, 0, i6, 0, 0, 12, null));
                                    int q4 = m04.q(androidx.compose.ui.layout.b.b()) != Integer.MIN_VALUE ? m04.q(androidx.compose.ui.layout.b.b()) : 0;
                                    int L0 = Float.isNaN(this.f13122a) ? 0 : kotlin.math.b.L0(this.f13122a);
                                    return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.p(j4), L0, null, new a(m02, L0, m04, this.f13123b, j4, m03, o0Var, this.f13124c, this.f13125d, q4), 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13136b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13137c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13138d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13139e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13140f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13141g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13142h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f13143i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ i.m f13144j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ i.e f13145k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13146l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f13147m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13148n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13149o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f13150p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f13151q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(androidx.compose.ui.q qVar, float f4, long j4, long j5, long j6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, float f5, i.m mVar, i.e eVar, int i4, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i5, int i6) {
            super(2);
            this.f13136b = qVar;
            this.f13137c = f4;
            this.f13138d = j4;
            this.f13139e = j5;
            this.f13140f = j6;
            this.f13141g = pVar;
            this.f13142h = v0Var;
            this.f13143i = f5;
            this.f13144j = mVar;
            this.f13145k = eVar;
            this.f13146l = i4;
            this.f13147m = z4;
            this.f13148n = pVar2;
            this.f13149o = pVar3;
            this.f13150p = i5;
            this.f13151q = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.m(this.f13136b, this.f13137c, this.f13138d, this.f13139e, this.f13140f, this.f13141g, this.f13142h, this.f13143i, this.f13144j, this.f13145k, this.f13146l, this.f13147m, this.f13148n, this.f13149o, tVar, androidx.compose.runtime.g3.b(this.f13150p | 1), androidx.compose.runtime.g3.b(this.f13151q));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class x extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ob f13152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.e f13153c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f13154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(ob obVar, k1.e eVar, k1.e eVar2) {
            super(0);
            this.f13152b = obVar;
            this.f13153c = eVar;
            this.f13154d = eVar2;
        }

        public final void a() {
            pb state;
            ob obVar = this.f13152b;
            if (kotlin.jvm.internal.l0.e((obVar == null || (state = obVar.getState()) == null) ? null : Float.valueOf(state.e()), this.f13153c.f75326b - this.f13154d.f75326b)) {
                return;
            }
            ob obVar2 = this.f13152b;
            pb state2 = obVar2 != null ? obVar2.getState() : null;
            if (state2 == null) {
                return;
            }
            state2.i(this.f13153c.f75326b - this.f13154d.f75326b);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2283:1\n73#2,7:2284\n80#2:2319\n84#2:2324\n78#3,11:2291\n91#3:2323\n456#4,8:2302\n464#4,3:2316\n467#4,3:2320\n3737#5,6:2310\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n*L\n1809#1:2284,7\n1809#1:2319\n1809#1:2324\n1809#1:2291,11\n1809#1:2323\n1809#1:2302,8\n1809#1:2316,3\n1809#1:2320,3\n1809#1:2310,6\n*E\n"})
    static final class y extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13155b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.e f13156c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mb f13157d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13158e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13159f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f13160g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f13161h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13162i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13163j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ k1.e f13164k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ob f13165l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13166m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13167n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f13168o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.f f13169p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f13170q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(androidx.compose.foundation.layout.n2 n2Var, k1.e eVar, mb mbVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, float f4, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, k1.e eVar2, ob obVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.ui.text.v0 v0Var2, float f5, k1.f fVar, boolean z5) {
            super(2);
            this.f13155b = n2Var;
            this.f13156c = eVar;
            this.f13157d = mbVar;
            this.f13158e = pVar;
            this.f13159f = v0Var;
            this.f13160g = f4;
            this.f13161h = z4;
            this.f13162i = pVar2;
            this.f13163j = pVar3;
            this.f13164k = eVar2;
            this.f13165l = obVar;
            this.f13166m = pVar4;
            this.f13167n = v0Var2;
            this.f13168o = f5;
            this.f13169p = fVar;
            this.f13170q = z5;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            pb state;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1985938853, i4, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1808)");
            }
            androidx.compose.foundation.layout.n2 n2Var = this.f13155b;
            k1.e eVar = this.f13156c;
            mb mbVar = this.f13157d;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f13158e;
            androidx.compose.ui.text.v0 v0Var = this.f13159f;
            float f4 = this.f13160g;
            boolean z4 = this.f13161h;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f13162i;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f13163j;
            k1.e eVar2 = this.f13164k;
            ob obVar = this.f13165l;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f13166m;
            androidx.compose.ui.text.v0 v0Var2 = this.f13167n;
            float f5 = this.f13168o;
            k1.f fVar = this.f13169p;
            boolean z5 = this.f13170q;
            tVar.P(-483455358);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, iVar.r(), tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            p.m(androidx.compose.ui.draw.h.b(androidx.compose.foundation.layout.d3.e(companion, n2Var)), eVar.f75326b, mbVar.getNavigationIconContentColor(), mbVar.getTitleContentColor(), mbVar.getActionIconContentColor(), pVar, v0Var, f4, iVar.f(), iVar.p(), 0, z4, pVar2, pVar3, tVar, 905969664, 3078);
            androidx.compose.foundation.layout.g3.INSTANCE.getClass();
            androidx.compose.ui.q b5 = androidx.compose.ui.draw.h.b(androidx.compose.foundation.layout.d3.e(companion, androidx.compose.foundation.layout.r2.j(n2Var, androidx.compose.foundation.layout.g3.f5051m)));
            float d5 = ((obVar == null || (state = obVar.getState()) == null) ? 0.0f : state.d()) + (eVar2.f75326b - eVar.f75326b);
            long navigationIconContentColor = mbVar.getNavigationIconContentColor();
            long titleContentColor = mbVar.getTitleContentColor();
            long actionIconContentColor = mbVar.getActionIconContentColor();
            i.m d6 = iVar.d();
            i.e p4 = iVar.p();
            int i5 = fVar.f75327b;
            c3 c3Var = c3.f10216a;
            c3Var.getClass();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar5 = c3.f10227l;
            c3Var.getClass();
            p.m(b5, d5, navigationIconContentColor, titleContentColor, actionIconContentColor, pVar4, v0Var2, f5, d6, p4, i5, z5, pVar5, c3.f10228m, tVar, 905969664, 3456);
            if (androidx.compose.material3.t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class z extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13171b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13172c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13173d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f13174e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13175f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13176g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13177h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13178i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13179j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ mb f13180k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f13181l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f13182m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ob f13183n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13184o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f13185p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f13186q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.text.v0 v0Var2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, float f5, float f6, ob obVar, int i4, int i5, int i6) {
            super(2);
            this.f13171b = qVar;
            this.f13172c = pVar;
            this.f13173d = v0Var;
            this.f13174e = f4;
            this.f13175f = pVar2;
            this.f13176g = v0Var2;
            this.f13177h = pVar3;
            this.f13178i = qVar2;
            this.f13179j = n2Var;
            this.f13180k = mbVar;
            this.f13181l = f5;
            this.f13182m = f6;
            this.f13183n = obVar;
            this.f13184o = i4;
            this.f13185p = i5;
            this.f13186q = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.n(this.f13171b, this.f13172c, this.f13173d, this.f13174e, this.f13175f, this.f13176g, this.f13177h, this.f13178i, this.f13179j, this.f13180k, this.f13181l, this.f13182m, this.f13183n, tVar, androidx.compose.runtime.g3.b(this.f13184o | 1), androidx.compose.runtime.g3.b(this.f13185p), this.f13186q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 16;
        float f5 = 12;
        float g4 = androidx.compose.ui.unit.h.g(f4) - f5;
        f12961a = g4;
        float f6 = f4 - f5;
        f12962b = f6;
        f12963c = f4 - g4;
        f12964d = f5 - f6;
        f12965e = new androidx.compose.animation.core.x(0.8f, 0.0f, 0.8f, 0.15f);
        f12966f = 24;
        f12967g = 28;
        float f7 = 4;
        f12968h = f7;
        f12969i = f4 - f7;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final pb A(float f4, float f5, float f6, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1801969826);
        if ((i5 & 1) != 0) {
            f4 = -3.4028235E38f;
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f6 = 0.0f;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1801969826, i4, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1051)");
        }
        Object[] objArr = new Object[0];
        pb.INSTANCE.getClass();
        androidx.compose.runtime.saveable.l lVar = pb.f13485f;
        tVar.P(1171243704);
        boolean z4 = ((((i4 & 14) ^ 6) > 4 && tVar.d(f4)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && tVar.d(f5)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && tVar.d(f6)) || (i4 & 384) == 256);
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e0(f4, f5, f6);
            tVar.E(Q);
        }
        tVar.p0();
        pb pbVar = (pb) androidx.compose.runtime.saveable.d.d(objArr, lVar, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return pbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(androidx.compose.material3.pb r22, float r23, androidx.compose.animation.core.z<java.lang.Float> r24, androidx.compose.animation.core.k<java.lang.Float> r25, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.B(androidx.compose.material3.pb, float, androidx.compose.animation.core.z, androidx.compose.animation.core.k, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @androidx.compose.material3.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(androidx.compose.material3.g0 r22, float r23, androidx.compose.animation.core.z<java.lang.Float> r24, androidx.compose.animation.core.k<java.lang.Float> r25, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.C(androidx.compose.material3.g0, float, androidx.compose.animation.core.z, androidx.compose.animation.core.k, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0083  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r24, long r25, long r27, float r29, @fg.m androidx.compose.foundation.layout.l1 r30, @fg.m androidx.compose.foundation.layout.n2 r31, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.a(androidx.compose.ui.q, long, long, float, androidx.compose.foundation.layout.l1, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bc  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.ui.q r32, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, long r34, long r36, float r38, @fg.m androidx.compose.foundation.layout.l1 r39, @fg.m androidx.compose.foundation.layout.n2 r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.b(ld.q, androidx.compose.ui.q, ld.p, long, long, float, androidx.compose.foundation.layout.l1, androidx.compose.foundation.layout.n2, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m androidx.compose.ui.q r37, long r38, long r40, float r42, @fg.m androidx.compose.foundation.layout.l1 r43, @fg.m androidx.compose.foundation.layout.n2 r44, @fg.m androidx.compose.material3.f0 r45, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r46, @fg.m androidx.compose.runtime.t r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.c(androidx.compose.ui.q, long, long, float, androidx.compose.foundation.layout.l1, androidx.compose.foundation.layout.n2, androidx.compose.material3.f0, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, long r33, long r35, float r37, @fg.m androidx.compose.foundation.layout.l1 r38, @fg.m androidx.compose.foundation.layout.n2 r39, @fg.m androidx.compose.material3.f0 r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.d(ld.q, androidx.compose.ui.q, ld.p, long, long, float, androidx.compose.foundation.layout.l1, androidx.compose.foundation.layout.n2, androidx.compose.material3.f0, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    @f5
    public static final androidx.compose.material3.g0 e(float f4, float f5, float f6) {
        return new androidx.compose.material3.h0(f4, f5, f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m androidx.compose.ui.q r22, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r23, @fg.m ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r24, @fg.m androidx.compose.foundation.layout.n2 r25, @fg.m androidx.compose.material3.mb r26, @fg.m androidx.compose.material3.ob r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.f(ld.p, androidx.compose.ui.q, ld.p, ld.q, androidx.compose.foundation.layout.n2, androidx.compose.material3.mb, androidx.compose.material3.ob, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.foundation.layout.n2 r30, @fg.m androidx.compose.material3.mb r31, @fg.m androidx.compose.material3.ob r32, @fg.m androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.g(ld.p, androidx.compose.ui.q, ld.p, ld.q, androidx.compose.foundation.layout.n2, androidx.compose.material3.mb, androidx.compose.material3.ob, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.foundation.layout.n2 r30, @fg.m androidx.compose.material3.mb r31, @fg.m androidx.compose.material3.ob r32, @fg.m androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.h(ld.p, androidx.compose.ui.q, ld.p, ld.q, androidx.compose.foundation.layout.n2, androidx.compose.material3.mb, androidx.compose.material3.ob, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void i(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, mb mbVar, ob obVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        androidx.compose.ui.q qVar3;
        int i6;
        androidx.compose.ui.q qVar4;
        androidx.compose.ui.q qVar5;
        pb state;
        androidx.compose.runtime.t o4 = tVar.o(1841601619);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
            qVar3 = qVar;
        } else if ((i4 & 6) == 0) {
            qVar3 = qVar;
            i6 = (o4.q0(qVar3) ? 4 : 2) | i4;
        } else {
            qVar3 = qVar;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.q0(v0Var) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= o4.b(z4) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i6 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i6 |= o4.S(pVar2) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i6 |= o.c.f32821k;
        } else if ((i4 & o.c.f32821k) == 0) {
            i6 |= o4.S(qVar2) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i6 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i6 |= o4.q0(n2Var) ? 1048576 : 524288;
        }
        if ((i5 & 128) != 0) {
            i6 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i6 |= o4.q0(mbVar) ? 8388608 : 4194304;
        }
        if ((i5 & 256) != 0) {
            i6 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i6 |= o4.q0(obVar) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((38347923 & i6) == 38347922 && o4.p()) {
            o4.d0();
            qVar5 = qVar3;
        } else {
            androidx.compose.ui.q qVar6 = i7 != 0 ? androidx.compose.ui.q.INSTANCE : qVar3;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1841601619, i6, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1635)");
            }
            float f4 = -((androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i())).v5(c0.o1.f37834a.c());
            o4.P(-1008351447);
            int i10 = i6 & 234881024;
            boolean d5 = (i10 == 67108864) | o4.d(f4);
            Object Q = o4.Q();
            if (d5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new m(obVar, f4);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.a1.k((ld.a) Q, o4, 0);
            androidx.compose.ui.q qVar7 = qVar6;
            androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c5 = androidx.compose.animation.u0.c(mbVar.a(((obVar == null || (state = obVar.getState()) == null) ? 0.0f : state.f()) > 0.01f ? 1.0f : 0.0f), androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null), null, null, o4, 48, 12);
            androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(o4, 1520880938, true, new C0283p(qVar2));
            o4.P(-1008350212);
            if (obVar == null || obVar.getIsPinned()) {
                qVar4 = androidx.compose.ui.q.INSTANCE;
            } else {
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                androidx.compose.foundation.gestures.j0 j0Var = androidx.compose.foundation.gestures.j0.Vertical;
                o4.P(-1008350035);
                boolean z5 = i10 == 67108864;
                Object Q2 = o4.Q();
                if (z5 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new q(obVar);
                    o4.E(Q2);
                }
                o4.p0();
                androidx.compose.foundation.gestures.d0 m4 = androidx.compose.foundation.gestures.b0.m((ld.l) Q2, o4, 0);
                o4.P(-1008349887);
                boolean z6 = i10 == 67108864;
                Object Q3 = o4.Q();
                if (z6 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q3 = new r(obVar, null);
                    o4.E(Q3);
                }
                o4.p0();
                qVar4 = androidx.compose.foundation.gestures.b0.k(companion, m4, j0Var, false, null, false, null, (ld.q) Q3, false, PictureConfig.CHOOSE_REQUEST, null);
            }
            o4.p0();
            qVar5 = qVar7;
            x9.a(qVar7.w3(qVar4), null, j(c5), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.c.b(o4, 376925230, true, new n(n2Var, mbVar, pVar, v0Var, z4, pVar2, b5, obVar)), o4, 12582912, 122);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new o(qVar5, pVar, v0Var, z4, pVar2, qVar2, n2Var, mbVar, obVar, i4, i5));
        }
    }

    private static final long j(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var) {
        return b5Var.getValue().M();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.WARNING, message = "Use TopAppBar instead.", replaceWith = @kotlin.x0(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    @androidx.compose.material3.f5
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r19, @fg.m androidx.compose.ui.q r20, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r22, @fg.m androidx.compose.foundation.layout.n2 r23, @fg.m androidx.compose.material3.mb r24, @fg.m androidx.compose.material3.ob r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.k(ld.p, androidx.compose.ui.q, ld.p, ld.q, androidx.compose.foundation.layout.n2, androidx.compose.material3.mb, androidx.compose.material3.ob, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m androidx.compose.ui.q r22, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r23, @fg.m ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r24, @fg.m androidx.compose.foundation.layout.n2 r25, @fg.m androidx.compose.material3.mb r26, @fg.m androidx.compose.material3.ob r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.l(ld.p, androidx.compose.ui.q, ld.p, ld.q, androidx.compose.foundation.layout.n2, androidx.compose.material3.mb, androidx.compose.material3.ob, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void m(androidx.compose.ui.q qVar, float f4, long j4, long j5, long j6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, float f5, i.m mVar, i.e eVar, int i4, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.runtime.t tVar, int i5, int i6) {
        int i7;
        int i10;
        androidx.compose.runtime.t o4 = tVar.o(-6794037);
        if ((i5 & 6) == 0) {
            i7 = (o4.q0(qVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.d(f4) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.g(j4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= o4.g(j5) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= o4.g(j6) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= o4.S(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= o4.q0(v0Var) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= o4.d(f5) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= o4.q0(mVar) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= o4.q0(eVar) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i6 & 6) == 0) {
            i10 = i6 | (o4.f(i4) ? 4 : 2);
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= o4.b(z4) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= o4.S(pVar2) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= o4.S(pVar3) ? 2048 : 1024;
        }
        int i11 = i10;
        if ((i7 & 306783379) == 306783378 && (i11 & 1171) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-6794037, i7, i11, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1899)");
            }
            o4.P(1019460550);
            boolean z5 = ((i7 & 112) == 32) | ((1879048192 & i7) == 536870912) | ((234881024 & i7) == 67108864) | ((i11 & 14) == 4);
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new v(f4, eVar, mVar, i4);
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            o4.P(-1323940314);
            int j7 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, m0Var, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, o4, j7, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(companion2, "navigationIcon");
            float f6 = f12968h;
            androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(b5, f6, 0.0f, 0.0f, 0.0f, 14, null);
            o4.P(733328855);
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
            int j10 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(o5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a8);
            } else {
                o4.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion, o4, a7, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j10))) {
                androidx.compose.animation.d.a(j10, o4, j10, a10);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar4 = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.runtime.b3<androidx.compose.ui.graphics.d2> e4 = p3.a().e(androidx.compose.ui.graphics.d2.n(j4));
            int i12 = androidx.compose.runtime.b3.f15974d;
            androidx.compose.runtime.f0.b(e4, pVar2, o4, ((i11 >> 3) & 112) | i12);
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            androidx.compose.ui.q e5 = androidx.compose.ui.graphics.p4.e(androidx.compose.foundation.layout.j1.m(androidx.compose.ui.layout.w.b(companion2, "title"), f6, 0.0f, 2, null).w3(z4 ? androidx.compose.ui.semantics.o.c(companion2, u.f13121b) : companion2), 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a11 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
            int j11 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B3 = o4.B();
            ld.a<androidx.compose.ui.node.g> a12 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(e5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a12);
            } else {
                o4.C();
            }
            ld.p a13 = androidx.compose.animation.p.a(companion, o4, a11, o4, B3);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j11))) {
                androidx.compose.animation.d.a(j11, o4, j11, a13);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            int i13 = i7 >> 9;
            w7.a(j5, v0Var, pVar, o4, ((i7 >> 15) & 112) | (i13 & 14) | (i13 & 896));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            androidx.compose.ui.q o6 = androidx.compose.foundation.layout.j1.o(androidx.compose.ui.layout.w.b(companion2, "actionIcons"), 0.0f, 0.0f, f6, 0.0f, 11, null);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a14 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
            int j12 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B4 = o4.B();
            ld.a<androidx.compose.ui.node.g> a15 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(o6);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a15);
            } else {
                o4.C();
            }
            ld.p a16 = androidx.compose.animation.p.a(companion, o4, a14, o4, B4);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j12))) {
                androidx.compose.animation.d.a(j12, o4, j12, a16);
            }
            g7.R(androidx.compose.runtime.v3.a(o4), o4, 0);
            o4.P(2058660585);
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j6)), pVar3, o4, ((i11 >> 6) & 112) | i12);
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new w(qVar, f4, j4, j5, j6, pVar, v0Var, f5, mVar, eVar, i4, z4, pVar2, pVar3, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(androidx.compose.ui.q r41, ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r42, androidx.compose.ui.text.v0 r43, float r44, ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r45, androidx.compose.ui.text.v0 r46, ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r47, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r48, androidx.compose.foundation.layout.n2 r49, androidx.compose.material3.mb r50, float r51, float r52, androidx.compose.material3.ob r53, androidx.compose.runtime.t r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p.n(androidx.compose.ui.q, ld.p, androidx.compose.ui.text.v0, float, ld.p, androidx.compose.ui.text.v0, ld.p, ld.q, androidx.compose.foundation.layout.n2, androidx.compose.material3.mb, float, float, androidx.compose.material3.ob, androidx.compose.runtime.t, int, int, int):void");
    }

    public static final float x() {
        return f12962b;
    }

    @fg.l
    public static final androidx.compose.animation.core.x y() {
        return f12965e;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final androidx.compose.material3.g0 z(float f4, float f5, float f6, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1420874240);
        if ((i5 & 1) != 0) {
            f4 = -3.4028235E38f;
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f6 = 0.0f;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1420874240, i4, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1372)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.l<androidx.compose.material3.g0, ?> a5 = androidx.compose.material3.g0.INSTANCE.a();
        tVar.P(647586024);
        boolean z4 = ((((i4 & 14) ^ 6) > 4 && tVar.d(f4)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && tVar.d(f5)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && tVar.d(f6)) || (i4 & 384) == 256);
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new d0(f4, f5, f6);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.material3.g0 g0Var = (androidx.compose.material3.g0) androidx.compose.runtime.saveable.d.d(objArr, a5, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g0Var;
    }
}
