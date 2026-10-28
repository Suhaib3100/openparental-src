package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.a;
import androidx.compose.ui.platform.c0;
import androidx.compose.ui.q;
import androidx.compose.ui.t;
import androidx.compose.ui.text.font.y;
import androidx.core.view.accessibility.h0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1436l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000Ì\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0016Ø\u0001\u008c\u0003\u008d\u0003ï\u0001ó\u0001û\u0001\u0084\u0002\u0088\u0002\u008e\u0002\u0092\u0002\u0097\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u0010\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d2\u0006\u0010\u001a\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010\u001a\u001a\u00020\n2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001c0 j\b\u0012\u0004\u0012\u00020\u001c`!2\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0$0#H\u0002¢\u0006\u0004\b&\u0010'JI\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u001c2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001c0 j\b\u0012\u0004\u0012\u00020\u001c`!2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0$0#H\u0002¢\u0006\u0004\b,\u0010-J+\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010\u001a\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0$H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0004\b@\u00104J\u001f\u0010A\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bA\u0010;J\u0019\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bE\u0010;J\u0017\u0010F\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010GJ=\u0010M\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\n2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020O2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0003¢\u0006\u0004\bS\u0010TJ?\u0010Z\u001a\u00020O2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010U\u001a\u0004\u0018\u00010\f2\b\u0010V\u001a\u0004\u0018\u00010\f2\b\u0010W\u001a\u0004\u0018\u00010\f2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\\\u0010GJ)\u0010`\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010]\u001a\u00020\f2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\b`\u0010aJ1\u0010c\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00132\u0006\u0010b\u001a\u00020<2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\bc\u0010dJ#\u0010i\u001a\u0004\u0018\u00010h2\b\u0010e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\bk\u0010lJ/\u0010o\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010m*\u00020X2\b\u0010Y\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010n\u001a\u00020\fH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020+2\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020+2\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bu\u0010tJ%\u0010x\u001a\u00020+2\u0006\u0010r\u001a\u00020q2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020\f0vH\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020+H\u0002¢\u0006\u0004\bz\u00102J\u000f\u0010{\u001a\u00020+H\u0002¢\u0006\u0004\b{\u00102J#\u0010~\u001a\u00020+2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0|H\u0002¢\u0006\u0004\b~\u0010\u007fJ$\u0010\u0082\u0001\u001a\u00020+2\u0007\u0010\u0080\u0001\u001a\u00020\f2\u0007\u0010\u0081\u0001\u001a\u00020<H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J+\u0010\u0086\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\f2\u000e\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010KH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0089\u0001\u001a\u00020+2\b\u0010\u0088\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J.\u0010\u008d\u0001\u001a\u00020+2\u0007\u0010\u008b\u0001\u001a\u00020\f2\u0006\u0010J\u001a\u00020\f2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001*\u00030\u008f\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001f\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0019\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001*\u00020\u001cH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J'\u0010\u009d\u0001\u001a\u00020+2\u0007\u0010\u009b\u0001\u001a\u00020\f2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0018\u0010m\u001a\u00020+2\u0007\u0010\u009b\u0001\u001a\u00020\fH\u0002¢\u0006\u0004\bm\u0010lJ\u0011\u0010\u009f\u0001\u001a\u00020+H\u0002¢\u0006\u0005\b\u009f\u0001\u00102J\u001a\u0010 \u0001\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001a\u0010¢\u0001\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0006\b¢\u0001\u0010¡\u0001J\u001a\u0010£\u0001\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0006\b£\u0001\u0010¡\u0001J\u0011\u0010¤\u0001\u001a\u00020+H\u0002¢\u0006\u0005\b¤\u0001\u00102J\u0011\u0010¥\u0001\u001a\u00020+H\u0002¢\u0006\u0005\b¥\u0001\u00102J\u0011\u0010¦\u0001\u001a\u00020+H\u0002¢\u0006\u0005\b¦\u0001\u00102J%\u0010ª\u0001\u001a\u00020+2\u0007\u0010§\u0001\u001a\u00020\u001c2\b\u0010©\u0001\u001a\u00030¨\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001b\u0010\u00ad\u0001\u001a\u00020+2\u0007\u0010¬\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J%\u0010¯\u0001\u001a\u00020+2\u0007\u0010§\u0001\u001a\u00020\u001c2\b\u0010©\u0001\u001a\u00030¨\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010«\u0001J\u001b\u0010°\u0001\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020\fH\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J5\u0010µ\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001c2\u0007\u0010²\u0001\u001a\u00020\f2\u0007\u0010³\u0001\u001a\u00020\n2\u0007\u0010´\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001a\u0010·\u0001\u001a\u00020+2\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b·\u0001\u0010lJ5\u0010»\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001c2\u0007\u0010¸\u0001\u001a\u00020\f2\u0007\u0010¹\u0001\u001a\u00020\f2\u0007\u0010º\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001a\u0010½\u0001\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010¿\u0001\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0006\b¿\u0001\u0010¾\u0001J\u0019\u0010À\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0005\bÀ\u0001\u00104J(\u0010Â\u0001\u001a\u0005\u0018\u00010Á\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u001c2\u0007\u0010²\u0001\u001a\u00020\fH\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001d\u0010Ä\u0001\u001a\u0004\u0018\u00010<2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0005\bÄ\u0001\u0010>J\u001a\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u0001*\u00030\u0093\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001c\u0010¬\u0001\u001a\u00020+2\b\u0010É\u0001\u001a\u00030È\u0001H\u0016¢\u0006\u0006\b¬\u0001\u0010Ê\u0001J\u001c\u0010Ë\u0001\u001a\u00020+2\b\u0010É\u0001\u001a\u00030È\u0001H\u0016¢\u0006\u0006\bË\u0001\u0010Ê\u0001J-\u0010Ì\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001b\u0010Ï\u0001\u001a\u00020\n2\u0007\u0010P\u001a\u00030Î\u0001H\u0000¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J&\u0010Ô\u0001\u001a\u00020\f2\b\u0010Ò\u0001\u001a\u00030Ñ\u00012\b\u0010Ó\u0001\u001a\u00030Ñ\u0001H\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u001d\u0010Ø\u0001\u001a\u00030×\u00012\b\u0010Ö\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0011\u0010Ú\u0001\u001a\u00020+H\u0000¢\u0006\u0005\bÚ\u0001\u00102J\u0013\u0010Û\u0001\u001a\u00020+H\u0080@¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0019\u0010Ý\u0001\u001a\u00020+2\u0006\u0010r\u001a\u00020qH\u0000¢\u0006\u0005\bÝ\u0001\u0010tJ\u0011\u0010Þ\u0001\u001a\u00020+H\u0000¢\u0006\u0005\bÞ\u0001\u00102J\u0011\u0010ß\u0001\u001a\u00020+H\u0000¢\u0006\u0005\bß\u0001\u00102J\u0011\u0010à\u0001\u001a\u00020+H\u0000¢\u0006\u0005\bà\u0001\u00102J9\u0010è\u0001\u001a\u00020+2\b\u0010â\u0001\u001a\u00030á\u00012\b\u0010ä\u0001\u001a\u00030ã\u00012\u0011\u0010ç\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010æ\u00010å\u0001H\u0001¢\u0006\u0006\bè\u0001\u0010é\u0001J%\u0010í\u0001\u001a\u00020+2\u0011\u0010ì\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ë\u00010ê\u0001H\u0001¢\u0006\u0006\bí\u0001\u0010î\u0001R\u001b\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0010\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R/\u0010ù\u0001\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bó\u0001\u0010ô\u0001\u0012\u0005\bø\u0001\u00102\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0005\b÷\u0001\u0010lR=\u0010\u0082\u0002\u001a\u000f\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\n0ú\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bû\u0001\u0010ü\u0001\u0012\u0005\b\u0081\u0002\u00102\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R1\u0010\u008c\u0002\u001a\u00020\n2\u0007\u0010\u0087\u0002\u001a\u00020\n8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0088\u0002\u0010S\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010®\u0001R\u0018\u0010\u0090\u0002\u001a\u00030\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002RD\u0010\u0099\u0002\u001a-\u0012\u000f\u0012\r \u0096\u0002*\u0005\u0018\u00010\u0095\u00020\u0095\u0002 \u0096\u0002*\u0015\u0012\u000f\u0012\r \u0096\u0002*\u0005\u0018\u00010\u0095\u00020\u0095\u0002\u0018\u00010K0$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u001a\u0010\u009d\u0002\u001a\u00030\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0018\u0010¡\u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001a\u0010¤\u0002\u001a\u00030×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0019\u0010¦\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010ô\u0001R\u001b\u0010©\u0002\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010«\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0002\u0010SR7\u0010±\u0002\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u00ad\u00020¬\u0002j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u00ad\u0002`®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R7\u0010³\u0002\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u00ad\u00020¬\u0002j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u00ad\u0002`®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0002\u0010°\u0002R'\u0010·\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020X0´\u00020´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R,\u0010¹\u0002\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\f0|0´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010¶\u0002R\u0019\u0010»\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010ô\u0001R\u001b\u0010½\u0002\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¼\u0002R\u001d\u0010¿\u0002\u001a\b\u0012\u0004\u0012\u00020q0v8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010¾\u0002R\u001e\u0010Ã\u0002\u001a\t\u0012\u0004\u0012\u00020+0À\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Å\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0002\u0010SR/\u0010Ê\u0002\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\bÆ\u0002\u0010S\u0012\u0005\bÉ\u0002\u00102\u001a\u0006\bÇ\u0002\u0010\u008a\u0002\"\u0006\bÈ\u0002\u0010®\u0001R3\u0010Ò\u0002\u001a\u0005\u0018\u00010\u0090\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bË\u0002\u0010Ì\u0002\u0012\u0005\bÑ\u0002\u00102\u001a\u0006\bÍ\u0002\u0010Î\u0002\"\u0006\bÏ\u0002\u0010Ð\u0002R%\u0010Ö\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u0098\u00010Ó\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R\u001d\u0010Ø\u0002\u001a\b\u0012\u0004\u0012\u00020\f0v8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0002\u0010¾\u0002R\u001c\u0010Ü\u0002\u001a\u0005\u0018\u00010Ù\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0|8B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\bÝ\u0002\u0010Þ\u0002\u001a\u0006\bß\u0002\u0010à\u0002R\u001f\u0010â\u0002\u001a\b\u0012\u0004\u0012\u00020\f0v8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0002\u0010¾\u0002RG\u0010ç\u0002\u001a \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0¬\u0002j\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`®\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bô\u0001\u0010°\u0002\u001a\u0006\bã\u0002\u0010ä\u0002\"\u0006\bå\u0002\u0010æ\u0002RG\u0010ë\u0002\u001a \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0¬\u0002j\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`®\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bè\u0002\u0010°\u0002\u001a\u0006\bé\u0002\u0010ä\u0002\"\u0006\bê\u0002\u0010æ\u0002R\u001f\u0010ð\u0002\u001a\u00020<8\u0000X\u0080D¢\u0006\u0010\n\u0006\bì\u0002\u0010í\u0002\u001a\u0006\bî\u0002\u0010ï\u0002R\u001f\u0010ó\u0002\u001a\u00020<8\u0000X\u0080D¢\u0006\u0010\n\u0006\bñ\u0002\u0010í\u0002\u001a\u0006\bò\u0002\u0010ï\u0002R\u0018\u0010÷\u0002\u001a\u00030ô\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0002\u0010ö\u0002R&\u0010ù\u0002\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030¨\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0002\u0010Þ\u0002R\u001a\u0010ü\u0002\u001a\u00030¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0002\u0010û\u0002R\u0017\u0010ý\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010SR\u0017\u0010\u0080\u0003\u001a\u00030þ\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010ÿ\u0002R\u001e\u0010\u0081\u0003\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010\u0098\u0002R$\u0010\u0082\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020+0ú\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010ü\u0001R\u0017\u0010\u0084\u0003\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0003\u0010\u008a\u0002R\u001e\u0010\u0087\u0003\u001a\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0005\b\u0086\u0003\u00102\u001a\u0006\b\u0085\u0003\u0010\u008a\u0002R\u0017\u0010\u0089\u0003\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0003\u0010\u008a\u0002R\u0017\u0010\u008b\u0003\u001a\u00020\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0003\u0010\u008a\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008e\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/a;", "Landroidx/lifecycle/l;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "Landroidx/compose/ui/platform/e5;", "currentSemanticsNodes", "", "vertical", "", "direction", "Li0/f;", "position", "V", "(Ljava/util/Collection;ZIJ)Z", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "a0", "(I)Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "Landroid/graphics/Rect;", "Q", "(Landroidx/compose/ui/platform/e5;)Landroid/graphics/Rect;", "layoutIsRtl", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/p;", "Lkotlin/Comparator;", "h1", "(Z)Ljava/util/Comparator;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentListToSort", "", "", "containerChildrenMapping", "J1", "(ZLjava/util/ArrayList;Ljava/util/Map;)Ljava/util/List;", "currNode", "geometryList", "containerMapToChildren", "Lkotlin/k2;", "e0", "(Landroidx/compose/ui/semantics/p;Ljava/util/ArrayList;Ljava/util/Map;)V", "listToSort", "N1", "(ZLjava/util/List;)Ljava/util/List;", "H1", "()V", "N0", "(Landroidx/compose/ui/semantics/p;)Z", "Landroidx/core/view/accessibility/h0;", "info", "semanticsNode", "b1", "(ILandroidx/core/view/accessibility/h0;Landroidx/compose/ui/semantics/p;)V", "z1", "(Landroidx/compose/ui/semantics/p;Landroidx/core/view/accessibility/h0;)V", "", "v0", "(Landroidx/compose/ui/semantics/p;)Ljava/lang/String;", "F1", "u0", "D1", "Landroid/text/SpannableString;", "w0", "(Landroidx/compose/ui/semantics/p;)Landroid/text/SpannableString;", "G1", "H0", "(I)Z", "f1", "eventType", "contentChangeType", "", "contentDescription", "o1", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "n1", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "Z", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "b0", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "X", "action", "Landroid/os/Bundle;", "arguments", "Y0", "(IILandroid/os/Bundle;)Z", "extraDataKey", "P", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Li0/i;", "bounds", "Landroid/graphics/RectF;", "O1", "(Landroidx/compose/ui/semantics/p;Li0/i;)Landroid/graphics/RectF;", "V1", "(I)V", "T", "size", "S1", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/h0;", "layoutNode", "Q0", "(Landroidx/compose/ui/node/h0;)V", "u1", "Landroidx/collection/d;", "subtreeChangedSemanticsNodesIds", "t1", "(Landroidx/compose/ui/node/h0;Landroidx/collection/d;)V", "W", "W1", "", "newSemanticsNodes", "s1", "(Ljava/util/Map;)V", "id", "newText", "m1", "(ILjava/lang/String;)V", "Landroidx/compose/ui/platform/d5;", "oldScrollObservationScopes", "e1", "(ILjava/util/List;)Z", "scrollObservationScope", "g1", "(Landroidx/compose/ui/platform/d5;)V", "semanticsNodeId", "title", "q1", "(IILjava/lang/String;)V", "Landroid/view/View;", "Landroidx/compose/ui/platform/coreshims/d;", "m0", "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/d;", "Landroidx/compose/ui/semantics/l;", "configuration", "Landroidx/compose/ui/text/n0;", "C0", "(Landroidx/compose/ui/semantics/l;)Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/platform/coreshims/f;", "P1", "(Landroidx/compose/ui/semantics/p;)Landroidx/compose/ui/platform/coreshims/f;", "virtualId", "viewStructure", "S", "(ILandroidx/compose/ui/platform/coreshims/f;)V", "P0", "T1", "(Landroidx/compose/ui/semantics/p;)V", "U1", "X1", "I1", "E0", "Y", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$i;", "oldNode", "k1", "(Landroidx/compose/ui/semantics/p;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$i;)V", "onStart", "G0", "(Z)V", "l1", "j1", "(I)I", "granularity", "forward", "extendSelection", "R1", "(Landroidx/compose/ui/semantics/p;IZZ)Z", "r1", "start", "end", "traversalMode", "w1", "(Landroidx/compose/ui/semantics/p;IIZ)Z", "h0", "(Landroidx/compose/ui/semantics/p;)I", "g0", "I0", "Landroidx/compose/ui/platform/a$f;", "y0", "(Landroidx/compose/ui/semantics/p;I)Landroidx/compose/ui/platform/a$f;", "x0", "Landroidx/compose/ui/text/e;", "B0", "(Landroidx/compose/ui/semantics/l;)Landroidx/compose/ui/text/e;", "Landroidx/lifecycle/e0;", "owner", "(Landroidx/lifecycle/e0;)V", "onStop", "U", "(ZIJ)Z", "Landroid/view/MotionEvent;", "c0", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "F0", "(FF)I", "host", "Landroidx/core/view/accessibility/m0;", "b", "(Landroid/view/View;)Landroidx/core/view/accessibility/m0;", "V0", "R", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "U0", "W0", "T0", "R0", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "S0", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "X0", "(Landroid/util/LongSparseArray;)V", "e", "Landroidx/compose/ui/platform/AndroidComposeView;", "D0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "f", "I", "q0", "()I", "A1", "r0", "hoveredVirtualViewId", "Lkotlin/Function1;", "g", "Lld/l;", "z0", "()Lld/l;", "E1", "(Lld/l;)V", "A0", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "h", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "i", "f0", "()Z", "v1", "accessibilityForceEnabledForTesting", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "j", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "k", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "l", "Ljava/util/List;", "enabledServices", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$k;", "m", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$k;", "translateStatus", "Landroid/os/Handler;", "n", "Landroid/os/Handler;", "handler", "o", "Landroidx/core/view/accessibility/m0;", "nodeProvider", "p", "focusedVirtualViewId", "q", "Landroid/view/accessibility/AccessibilityNodeInfo;", "currentlyFocusedANI", "r", "sendingFocusAffectingEvent", "Ljava/util/HashMap;", "Landroidx/compose/ui/semantics/j;", "Lkotlin/collections/HashMap;", "s", "Ljava/util/HashMap;", "pendingHorizontalScrollEvents", "t", "pendingVerticalScrollEvents", "Landroidx/collection/c3;", "u", "Landroidx/collection/c3;", "actionIdToLabel", "v", "labelToActionId", "w", "accessibilityCursorPosition", "Ljava/lang/Integer;", "previousTraversedNode", "Landroidx/collection/d;", "subtreeChangedLayoutNodes", "Lkotlinx/coroutines/channels/l;", "z", "Lkotlinx/coroutines/channels/l;", "boundsUpdateChannel", "A", "currentSemanticsNodesInvalidated", "B", "i0", "x1", "j0", "contentCaptureForceEnabledForTesting", "C", "Landroidx/compose/ui/platform/coreshims/d;", "k0", "()Landroidx/compose/ui/platform/coreshims/d;", "y1", "(Landroidx/compose/ui/platform/coreshims/d;)V", "l0", "contentCaptureSession", "Landroidx/collection/a;", "D", "Landroidx/collection/a;", "bufferedContentCaptureAppearedNodes", "E", "bufferedContentCaptureDisappearedNodes", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "F", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "pendingTextTraversedEvent", "G", "Ljava/util/Map;", "n0", "()Ljava/util/Map;", "H", "paneDisplayed", "t0", "()Ljava/util/HashMap;", "C1", "(Ljava/util/HashMap;)V", "idToBeforeMap", "J", "s0", "B1", "idToAfterMap", "K", "Ljava/lang/String;", "p0", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "L", "o0", "ExtraDataTestTraversalAfterVal", "Landroidx/compose/ui/text/platform/b0;", "M", "Landroidx/compose/ui/text/platform/b0;", "urlSpanCache", "N", "previousSemanticsNodes", "O", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$i;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "J0", "isEnabled", "L0", "M0", "isEnabledForContentCapture", "O0", "isTouchExplorationEnabled", "K0", "isEnabledForAccessibility", "c", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3790:1\n583#1,5:3798\n1747#2,3:3791\n33#3,4:3794\n38#3:3803\n33#3,6:3806\n33#3,6:3812\n33#3,6:3820\n33#3,6:3830\n69#3,6:3836\n69#3,6:3842\n33#3,6:3852\n33#3,6:3867\n33#3,6:3873\n151#3,3:3879\n33#3,4:3882\n154#3,2:3886\n38#3:3888\n156#3:3889\n151#3,3:3890\n33#3,4:3893\n154#3,2:3897\n38#3:3899\n156#3:3900\n33#3,6:3901\n33#3,6:3907\n33#3,6:3913\n33#3,6:3919\n33#3,6:3925\n33#3,6:3931\n3586#4:3804\n3588#4:3805\n3586#4:3818\n3585#4:3819\n3583#4:3826\n3585#4:3827\n3586#4:3828\n3586#4:3829\n3583#4:3848\n3586#4:3850\n3586#4:3851\n3585#4:3862\n3585#4:3863\n3583#4:3864\n3585#4:3865\n3583#4:3866\n3585#4:3937\n1#5:3849\n37#6,2:3858\n76#7:3860\n76#7:3861\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n661#1:3798,5\n459#1:3791,3\n659#1:3794,4\n659#1:3803\n720#1:3806,6\n742#1:3812,6\n830#1:3820,6\n1227#1:3830,6\n1238#1:3836,6\n1245#1:3842,6\n1942#1:3852,6\n2703#1:3867,6\n2707#1:3873,6\n2980#1:3879,3\n2980#1:3882,4\n2980#1:3886,2\n2980#1:3888\n2980#1:3889\n2987#1:3890,3\n2987#1:3893,4\n2987#1:3897,2\n2987#1:3899\n2987#1:3900\n3001#1:3901,6\n3009#1:3907,6\n3084#1:3913,6\n3102#1:3919,6\n3124#1:3925,6\n3137#1:3931,6\n703#1:3804\n707#1:3805\n756#1:3818\n811#1:3819\n908#1:3826\n910#1:3827\n1132#1:3828\n1142#1:3829\n1591#1:3848\n1775#1:3850\n1929#1:3851\n2563#1:3862\n2596#1:3863\n2597#1:3864\n2598#1:3865\n2599#1:3866\n3368#1:3937\n1998#1:3858,2\n2113#1:3860\n2332#1:3861\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.a implements InterfaceC1436l {
    public static final int Q1 = Integer.MIN_VALUE;
    public static final int Q2 = 100000;
    public static final int R2 = -1;
    public static final int S2 = 20;
    public static final long T2 = 100;
    public static final long U2 = 1000;
    public static final int Z = 8;

    /* renamed from: A, reason: from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated;

    /* renamed from: B, reason: from kotlin metadata */
    private boolean contentCaptureForceEnabledForTesting;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.platform.coreshims.d contentCaptureSession;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private final androidx.collection.a<Integer, androidx.compose.ui.platform.coreshims.f> bufferedContentCaptureAppearedNodes;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final androidx.collection.d<Integer> bufferedContentCaptureDisappearedNodes;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.m
    private g pendingTextTraversedEvent;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.l
    private Map<Integer, e5> currentSemanticsNodes;

    /* renamed from: H, reason: from kotlin metadata */
    @fg.l
    private androidx.collection.d<Integer> paneDisplayed;

    /* renamed from: I, reason: from kotlin metadata */
    @fg.l
    private HashMap<Integer, Integer> idToBeforeMap;

    /* renamed from: J, reason: from kotlin metadata */
    @fg.l
    private HashMap<Integer, Integer> idToAfterMap;

    /* renamed from: K, reason: from kotlin metadata */
    @fg.l
    private final String ExtraDataTestTraversalBeforeVal;

    /* renamed from: L, reason: from kotlin metadata */
    @fg.l
    private final String ExtraDataTestTraversalAfterVal;

    /* renamed from: M, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.platform.b0 urlSpanCache;

    /* renamed from: N, reason: from kotlin metadata */
    @fg.l
    private Map<Integer, i> previousSemanticsNodes;

    /* renamed from: O, reason: from kotlin metadata */
    @fg.l
    private i previousSemanticsRoot;

    /* renamed from: P, reason: from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* renamed from: Q, reason: from kotlin metadata */
    @fg.l
    private final Runnable semanticsChangeChecker;

    /* renamed from: R, reason: from kotlin metadata */
    @fg.l
    private final List<d5> scrollObservationScopes;

    /* renamed from: X, reason: from kotlin metadata */
    @fg.l
    private final ld.l<d5, kotlin.k2> scheduleScrollEventIfNeededLambda;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeView view;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int hoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new o();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AccessibilityManager accessibilityManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<AccessibilityServiceInfo> enabledServices;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private k translateStatus;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Handler handler;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.core.view.accessibility.m0 nodeProvider;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int focusedVirtualViewId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private AccessibilityNodeInfo currentlyFocusedANI;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean sendingFocusAffectingEvent;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<Integer, androidx.compose.ui.semantics.j> pendingHorizontalScrollEvents;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<Integer, androidx.compose.ui.semantics.j> pendingVerticalScrollEvents;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.collection.c3<androidx.collection.c3<CharSequence>> actionIdToLabel;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.collection.c3<Map<CharSequence, Integer>> labelToActionId;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int accessibilityCursorPosition;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer previousTraversedNode;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.collection.d<androidx.compose.ui.node.h0> subtreeChangedLayoutNodes;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.l<kotlin.k2> boundsUpdateChannel;

    @fg.l
    public static final String P2 = "androidx.compose.ui.semantics.id";

    @fg.l
    public static final String O2 = "androidx.compose.ui.semantics.testTag";

    @fg.l
    public static final String N2 = "AccessibilityDelegate";

    @fg.l
    public static final String M2 = "android.widget.TextView";

    @fg.l
    public static final String L2 = "android.widget.EditText";

    @fg.l
    public static final String V1 = "android.view.View";

    @fg.l
    private static final int[] V2 = {t.b.f20418a, t.b.f20419b, t.b.f20430m, t.b.f20441x, t.b.A, t.b.B, t.b.C, t.b.D, t.b.E, t.b.F, t.b.f20420c, t.b.f20421d, t.b.f20422e, t.b.f20423f, t.b.f20424g, t.b.f20425h, t.b.f20426i, t.b.f20427j, t.b.f20428k, t.b.f20429l, t.b.f20431n, t.b.f20432o, t.b.f20433p, t.b.f20434q, t.b.f20435r, t.b.f20436s, t.b.f20437t, t.b.f20438u, t.b.f20439v, t.b.f20440w, t.b.f20442y, t.b.f20443z};

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@fg.l View view) {
            AccessibilityManager accessibilityManager = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
            accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.getContentCaptureForceEnabledForTesting()) {
                return;
            }
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat2.y1(androidComposeViewAccessibilityDelegateCompat2.m0(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@fg.l View view) {
            AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
            AccessibilityManager accessibilityManager = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
            accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            AndroidComposeViewAccessibilityDelegateCompat.this.y1(null);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$b;", "", "<init>", "()V", "Landroidx/core/view/accessibility/h0;", "info", "Landroidx/compose/ui/semantics/p;", "semanticsNode", "Lkotlin/k2;", "a", "(Landroidx/core/view/accessibility/h0;Landroidx/compose/ui/semantics/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(24)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f19649a = new b();

        private b() {
        }

        @androidx.annotation.u
        @kd.n
        public static final void a(@fg.l androidx.core.view.accessibility.h0 info, @fg.l androidx.compose.ui.semantics.p semanticsNode) {
            boolean p4;
            androidx.compose.ui.semantics.a aVar;
            p4 = c0.p(semanticsNode);
            if (!p4 || (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.k.f20321a.w())) == null) {
                return;
            }
            info.b(new h0.a(R.id.accessibilityActionSetProgress, aVar.getLabel()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$c;", "", "<init>", "()V", "Landroidx/core/view/accessibility/h0;", "info", "Landroidx/compose/ui/semantics/p;", "semanticsNode", "Lkotlin/k2;", "a", "(Landroidx/core/view/accessibility/h0;Landroidx/compose/ui/semantics/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(29)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final c f19650a = new c();

        private c() {
        }

        @androidx.annotation.u
        @kd.n
        public static final void a(@fg.l androidx.core.view.accessibility.h0 info, @fg.l androidx.compose.ui.semantics.p semanticsNode) {
            boolean p4;
            p4 = c0.p(semanticsNode);
            if (p4) {
                androidx.compose.ui.semantics.l unmergedConfig = semanticsNode.getUnmergedConfig();
                androidx.compose.ui.semantics.k kVar = androidx.compose.ui.semantics.k.f20321a;
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(unmergedConfig, kVar.p());
                if (aVar != null) {
                    info.b(new h0.a(R.id.accessibilityActionPageUp, aVar.getLabel()));
                }
                androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(semanticsNode.getUnmergedConfig(), kVar.m());
                if (aVar2 != null) {
                    info.b(new h0.a(R.id.accessibilityActionPageDown, aVar2.getLabel()));
                }
                androidx.compose.ui.semantics.a aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(semanticsNode.getUnmergedConfig(), kVar.n());
                if (aVar3 != null) {
                    info.b(new h0.a(R.id.accessibilityActionPageLeft, aVar3.getLabel()));
                }
                androidx.compose.ui.semantics.a aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(semanticsNode.getUnmergedConfig(), kVar.o());
                if (aVar4 != null) {
                    info.b(new h0.a(R.id.accessibilityActionPageRight, aVar4.getLabel()));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$e;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createAccessibilityNodeInfo", "(I)Landroid/view/accessibility/AccessibilityNodeInfo;", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "Lkotlin/k2;", "addExtraDataToAccessibilityNodeInfo", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "findFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, @fg.l AccessibilityNodeInfo info, @fg.l String extraDataKey, @fg.m Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.P(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @fg.m
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            AccessibilityNodeInfo a02 = AndroidComposeViewAccessibilityDelegateCompat.this.a0(virtualViewId);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.sendingFocusAffectingEvent && virtualViewId == AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId) {
                AndroidComposeViewAccessibilityDelegateCompat.this.currentlyFocusedANI = a02;
            }
            return a02;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @fg.m
        public AccessibilityNodeInfo findFocus(int focus) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, @fg.m Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.Y0(virtualViewId, action, arguments);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Landroidx/compose/ui/semantics/p;Landroidx/compose/ui/semantics/p;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class f implements Comparator<androidx.compose.ui.semantics.p> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final f f19652b = new f();

        private f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@fg.l androidx.compose.ui.semantics.p a5, @fg.l androidx.compose.ui.semantics.p b5) {
            i0.i k4 = a5.k();
            i0.i k5 = b5.k();
            int compare = Float.compare(k4.t(), k5.t());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(k4.getTop(), k5.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(k4.j(), k5.j());
            return compare3 != 0 ? compare3 : Float.compare(k4.x(), k5.x());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "", "Landroidx/compose/ui/semantics/p;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Landroidx/compose/ui/semantics/p;IIIIJ)V", "a", "Landroidx/compose/ui/semantics/p;", "d", "()Landroidx/compose/ui/semantics/p;", "b", "I", "()I", "c", "e", "f", "J", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class g {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.semantics.p node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int granularity;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long traverseTime;

        public g(@fg.l androidx.compose.ui.semantics.p pVar, int i4, int i5, int i6, int i7, long j4) {
            this.node = pVar;
            this.action = i4;
            this.granularity = i5;
            this.fromIndex = i6;
            this.toIndex = i7;
            this.traverseTime = j4;
        }

        /* renamed from: a, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* renamed from: c, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final androidx.compose.ui.semantics.p getNode() {
            return this.node;
        }

        /* renamed from: e, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* renamed from: f, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$h;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Landroidx/compose/ui/semantics/p;Landroidx/compose/ui/semantics/p;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class h implements Comparator<androidx.compose.ui.semantics.p> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final h f19659b = new h();

        private h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@fg.l androidx.compose.ui.semantics.p a5, @fg.l androidx.compose.ui.semantics.p b5) {
            i0.i k4 = a5.k();
            i0.i k5 = b5.k();
            int compare = Float.compare(k5.x(), k4.x());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(k4.getTop(), k5.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(k4.j(), k5.j());
            return compare3 != 0 ? compare3 : Float.compare(k5.t(), k4.t());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\r\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$i;", "", "Landroidx/compose/ui/semantics/p;", "semanticsNode", "", "", "Landroidx/compose/ui/platform/e5;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/p;Ljava/util/Map;)V", "", "d", "()Z", "a", "Landroidx/compose/ui/semantics/p;", "b", "()Landroidx/compose/ui/semantics/p;", "Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/semantics/l;", "c", "()Landroidx/compose/ui/semantics/l;", "unmergedConfig", "", "Ljava/util/Set;", "()Ljava/util/Set;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3790:1\n33#2,6:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n372#1:3791,6\n*E\n"})
    private static final class i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.semantics.p semanticsNode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.semantics.l unmergedConfig;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Set<Integer> children = new LinkedHashSet();

        public i(@fg.l androidx.compose.ui.semantics.p pVar, @fg.l Map<Integer, e5> map) {
            this.semanticsNode = pVar;
            this.unmergedConfig = pVar.getUnmergedConfig();
            List<androidx.compose.ui.semantics.p> w4 = pVar.w();
            int size = w4.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.semantics.p pVar2 = w4.get(i4);
                if (map.containsKey(Integer.valueOf(pVar2.getId()))) {
                    this.children.add(Integer.valueOf(pVar2.getId()));
                }
            }
        }

        @fg.l
        public final Set<Integer> a() {
            return this.children;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final androidx.compose.ui.semantics.p getSemanticsNode() {
            return this.semanticsNode;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final androidx.compose.ui.semantics.l getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean d() {
            return this.unmergedConfig.f(androidx.compose.ui.semantics.t.f20369a.u());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\t\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$j;", "Ljava/util/Comparator;", "Lkotlin/q0;", "Li0/i;", "", "Landroidx/compose/ui/semantics/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Lkotlin/q0;Lkotlin/q0;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class j implements Comparator<kotlin.q0<? extends i0.i, ? extends List<androidx.compose.ui.semantics.p>>> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final j f19663b = new j();

        private j() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@fg.l kotlin.q0<i0.i, ? extends List<androidx.compose.ui.semantics.p>> a5, @fg.l kotlin.q0<i0.i, ? extends List<androidx.compose.ui.semantics.p>> b5) {
            int compare = Float.compare(a5.e().getTop(), b5.e().getTop());
            return compare != 0 ? compare : Float.compare(a5.e().j(), b5.e().j());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$k;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum k {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$l;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegateCompat", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "c", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;[J[ILjava/util/function/Consumer;)V", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(31)
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3790:1\n13607#2,2:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS\n*L\n3490#1:3791,2\n*E\n"})
    static final class l {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final l f19664a = new l();

        private l() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            r3 = r3.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            r3 = r3.getValue("android:text");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r11, android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> r12) {
            /*
                r10 = this;
                kotlin.collections.v0 r0 = androidx.core.util.p.j(r12)
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6c
                long r1 = r0.c()
                java.lang.Object r3 = r12.get(r1)
                android.view.translation.ViewTranslationResponse r3 = androidx.compose.ui.platform.s.a(r3)
                if (r3 == 0) goto L4
                java.lang.String r4 = "android:text"
                android.view.translation.TranslationResponseValue r3 = androidx.compose.ui.platform.t.a(r3, r4)
                if (r3 == 0) goto L4
                java.lang.CharSequence r3 = androidx.compose.ui.platform.u.a(r3)
                if (r3 == 0) goto L4
                java.util.Map r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A(r11)
                int r1 = (int) r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r4.get(r1)
                androidx.compose.ui.platform.e5 r1 = (androidx.compose.ui.platform.e5) r1
                if (r1 == 0) goto L4
                androidx.compose.ui.semantics.p r1 = r1.getSemanticsNode()
                if (r1 == 0) goto L4
                androidx.compose.ui.semantics.l r1 = r1.getUnmergedConfig()
                androidx.compose.ui.semantics.k r2 = androidx.compose.ui.semantics.k.f20321a
                androidx.compose.ui.semantics.y r2 = r2.z()
                java.lang.Object r1 = androidx.compose.ui.semantics.m.a(r1, r2)
                androidx.compose.ui.semantics.a r1 = (androidx.compose.ui.semantics.a) r1
                if (r1 == 0) goto L4
                kotlin.v r1 = r1.a()
                ld.l r1 = (ld.l) r1
                if (r1 == 0) goto L4
                androidx.compose.ui.text.e r2 = new androidx.compose.ui.text.e
                java.lang.String r5 = r3.toString()
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                java.lang.Object r1 = r1.invoke(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L4
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.l.b(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, android.util.LongSparseArray):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LongSparseArray longSparseArray) {
            f19664a.b(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
        }

        @androidx.annotation.u
        @androidx.annotation.x0(31)
        public final void c(@fg.l AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegateCompat, @fg.l long[] virtualIds, @fg.l int[] supportedFormats, @fg.l Consumer<ViewTranslationRequest> requestsCollector) {
            androidx.compose.ui.semantics.p semanticsNode;
            AutofillId autofillId;
            String y4;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j4 : virtualIds) {
                e5 e5Var = (e5) accessibilityDelegateCompat.n0().get(Integer.valueOf((int) j4));
                if (e5Var != null && (semanticsNode = e5Var.getSemanticsNode()) != null) {
                    a0.a();
                    autofillId = accessibilityDelegateCompat.getView().getAutofillId();
                    ViewTranslationRequest.Builder a5 = z.a(autofillId, semanticsNode.getId());
                    y4 = c0.y(semanticsNode);
                    if (y4 != null) {
                        forText = TranslationRequestValue.forText(new androidx.compose.ui.text.e(y4, null, null, 6, null));
                        a5.setValue("android:text", forText);
                        build = a5.build();
                        requestsCollector.accept(build);
                    }
                }
            }
        }

        @androidx.annotation.u
        @androidx.annotation.x0(31)
        public final void d(@fg.l final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegateCompat, @fg.l final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (kotlin.jvm.internal.l0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(accessibilityDelegateCompat, response);
            } else {
                accessibilityDelegateCompat.getView().post(new Runnable() { // from class: androidx.compose.ui.platform.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeViewAccessibilityDelegateCompat.l.e(AndroidComposeViewAccessibilityDelegateCompat.this, response);
                    }
                });
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19665a;

        static {
            int[] iArr = new int[p0.a.values().length];
            try {
                iArr[p0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19665a = iArr;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 0, 1, 1}, l = {2213, 2249}, m = "boundsUpdatesEventLoop$ui_release", n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f19666b;

        /* renamed from: c, reason: collision with root package name */
        Object f19667c;

        /* renamed from: d, reason: collision with root package name */
        Object f19668d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f19669e;

        /* renamed from: g, reason: collision with root package name */
        int f19671g;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f19669e = obj;
            this.f19671g |= Integer.MIN_VALUE;
            return AndroidComposeViewAccessibilityDelegateCompat.this.R(this);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/accessibility/AccessibilityEvent;", "it", "", "a", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<AccessibilityEvent, Boolean> {
        o() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d5 f19673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f19674c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(d5 d5Var, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
            super(0);
            this.f19673b = d5Var;
            this.f19674c = androidComposeViewAccessibilityDelegateCompat;
        }

        public final void a() {
            androidx.compose.ui.semantics.p semanticsNode;
            androidx.compose.ui.node.h0 layoutNode;
            androidx.compose.ui.semantics.j horizontalScrollAxisRange = this.f19673b.getHorizontalScrollAxisRange();
            androidx.compose.ui.semantics.j verticalScrollAxisRange = this.f19673b.getVerticalScrollAxisRange();
            Float oldXValue = this.f19673b.getOldXValue();
            Float oldYValue = this.f19673b.getOldYValue();
            float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.c().invoke().floatValue() - oldXValue.floatValue();
            float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.c().invoke().floatValue() - oldYValue.floatValue();
            if (floatValue != 0.0f || floatValue2 != 0.0f) {
                int j12 = this.f19674c.j1(this.f19673b.getSemanticsNodeId());
                e5 e5Var = (e5) this.f19674c.n0().get(Integer.valueOf(this.f19674c.focusedVirtualViewId));
                if (e5Var != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f19674c;
                    try {
                        AccessibilityNodeInfo accessibilityNodeInfo = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                        if (accessibilityNodeInfo != null) {
                            accessibilityNodeInfo.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.Q(e5Var));
                            kotlin.k2 k2Var = kotlin.k2.f75408a;
                        }
                    } catch (IllegalStateException unused) {
                        kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                    }
                }
                this.f19674c.getView().invalidate();
                e5 e5Var2 = (e5) this.f19674c.n0().get(Integer.valueOf(j12));
                if (e5Var2 != null && (semanticsNode = e5Var2.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.f19674c;
                    if (horizontalScrollAxisRange != null) {
                        androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents.put(Integer.valueOf(j12), horizontalScrollAxisRange);
                    }
                    if (verticalScrollAxisRange != null) {
                        androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents.put(Integer.valueOf(j12), verticalScrollAxisRange);
                    }
                    androidComposeViewAccessibilityDelegateCompat2.Q0(layoutNode);
                }
            }
            if (horizontalScrollAxisRange != null) {
                this.f19673b.h(horizontalScrollAxisRange.c().invoke());
            }
            if (verticalScrollAxisRange != null) {
                this.f19673b.i(verticalScrollAxisRange.c().invoke());
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/d5;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/d5;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<d5, kotlin.k2> {
        q() {
            super(1);
        }

        public final void a(@fg.l d5 d5Var) {
            AndroidComposeViewAccessibilityDelegateCompat.this.g1(d5Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(d5 d5Var) {
            a(d5Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "K", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$f", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n585#2:329\n*E\n"})
    public static final class r<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f19676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator f19677c;

        public r(Comparator comparator, Comparator comparator2) {
            this.f19676b = comparator;
            this.f19677c = comparator2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f19676b.compare(t4, t5);
            return compare != 0 ? compare : this.f19677c.compare(((androidx.compose.ui.semantics.p) t4).getLayoutNode(), ((androidx.compose.ui.semantics.p) t5).getLayoutNode());
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$e", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n587#2:329\n*E\n"})
    public static final class s<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f19678b;

        public s(Comparator comparator) {
            this.f19678b = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f19678b.compare(t4, t5);
            return compare != 0 ? compare : kotlin.comparisons.a.l(Integer.valueOf(((androidx.compose.ui.semantics.p) t4).getId()), Integer.valueOf(((androidx.compose.ui.semantics.p) t5).getId()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f19679b = new t(1);

        t() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.node.h0 h0Var) {
            androidx.compose.ui.semantics.l Z = h0Var.Z();
            boolean z4 = false;
            if (Z != null && Z.getIsMergingSemanticsOfDescendants()) {
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3790:1\n76#2:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1\n*L\n2335#1:3791\n*E\n"})
    static final class u extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f19680b = new u(1);

        u() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.node.h0 h0Var) {
            return Boolean.valueOf(h0Var.getNodes().t(8));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Landroidx/compose/ui/semantics/p;", "kotlin.jvm.PlatformType", "a", "b", "", "(Landroidx/compose/ui/semantics/p;Landroidx/compose/ui/semantics/p;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n1#1,3790:1\n3590#2:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2\n*L\n667#1:3791\n*E\n"})
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.semantics.p, androidx.compose.ui.semantics.p, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final v f19681b = new v(2);

        v() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(androidx.compose.ui.semantics.p pVar, androidx.compose.ui.semantics.p pVar2) {
            androidx.compose.ui.semantics.l n4 = pVar.n();
            androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
            androidx.compose.ui.semantics.y<Float> G = tVar.G();
            c0.c cVar = c0.c.f19786b;
            return Integer.valueOf(Float.compare(((Number) n4.l(G, cVar)).floatValue(), ((Number) pVar2.n().l(tVar.G(), cVar)).floatValue()));
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@fg.l AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z4) {
                AndroidComposeViewAccessibilityDelegateCompat.d0(AndroidComposeViewAccessibilityDelegateCompat.this, z4);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z4) {
                AndroidComposeViewAccessibilityDelegateCompat.Q1(AndroidComposeViewAccessibilityDelegateCompat.this, z4);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.translateStatus = k.SHOW_ORIGINAL;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new androidx.core.view.accessibility.m0(new e());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new HashMap<>();
        this.pendingVerticalScrollEvents = new HashMap<>();
        this.actionIdToLabel = new androidx.collection.c3<>(0, 1, null);
        this.labelToActionId = new androidx.collection.c3<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new androidx.collection.d<>(0, 1, null);
        this.boundsUpdateChannel = kotlinx.coroutines.channels.o.d(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new androidx.collection.a<>();
        this.bufferedContentCaptureDisappearedNodes = new androidx.collection.d<>(0, 1, null);
        this.currentSemanticsNodes = kotlin.collections.z0.z();
        this.paneDisplayed = new androidx.collection.d<>(0, 1, null);
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new androidx.compose.ui.text.platform.b0();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new i(androidComposeView.getSemanticsOwner().b(), kotlin.collections.z0.z());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.q
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.i1(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new q();
    }

    @androidx.annotation.m1
    public static /* synthetic */ void A0() {
    }

    private final androidx.compose.ui.text.e B0(androidx.compose.ui.semantics.l lVar) {
        return (androidx.compose.ui.text.e) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.t.f20369a.e());
    }

    private final androidx.compose.ui.text.n0 C0(androidx.compose.ui.semantics.l configuration) {
        ld.l lVar;
        ArrayList arrayList = new ArrayList();
        androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(configuration, androidx.compose.ui.semantics.k.f20321a.h());
        if (aVar == null || (lVar = (ld.l) aVar.a()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.n0) arrayList.get(0);
    }

    private final void D1(androidx.compose.ui.semantics.p node, androidx.core.view.accessibility.h0 info) {
        info.h1(u0(node));
    }

    private final void E0() {
        androidx.compose.ui.semantics.a aVar;
        ld.l lVar;
        Iterator<e5> it = n0().values().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.semantics.l unmergedConfig = it.next().getSemanticsNode().getUnmergedConfig();
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.t.f20369a.r()), Boolean.TRUE) && (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.k.f20321a.A())) != null && (lVar = (ld.l) aVar.a()) != null) {
            }
        }
    }

    private final void F1(androidx.compose.ui.semantics.p node, androidx.core.view.accessibility.h0 info) {
        info.c2(v0(node));
    }

    private final void G0(boolean onStart) {
        if (onStart) {
            T1(this.view.getSemanticsOwner().b());
        } else {
            U1(this.view.getSemanticsOwner().b());
        }
        P0();
    }

    private final void G1(androidx.compose.ui.semantics.p node, androidx.core.view.accessibility.h0 info) {
        info.d2(w0(node));
    }

    private final boolean H0(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final void H1() {
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        e5 e5Var = n0().get(-1);
        androidx.compose.ui.semantics.p semanticsNode = e5Var != null ? e5Var.getSemanticsNode() : null;
        kotlin.jvm.internal.l0.m(semanticsNode);
        int i4 = 1;
        List<androidx.compose.ui.semantics.p> N1 = N1(semanticsNode.p().getLayoutDirection() == androidx.compose.ui.unit.w.Rtl, kotlin.collections.w.S(semanticsNode));
        int J = kotlin.collections.w.J(N1);
        if (1 > J) {
            return;
        }
        while (true) {
            int id2 = N1.get(i4 - 1).getId();
            int id3 = N1.get(i4).getId();
            this.idToBeforeMap.put(Integer.valueOf(id2), Integer.valueOf(id3));
            this.idToAfterMap.put(Integer.valueOf(id3), Integer.valueOf(id2));
            if (i4 == J) {
                return;
            } else {
                i4++;
            }
        }
    }

    private final boolean I0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        return !unmergedConfig.f(tVar.c()) && node.getUnmergedConfig().f(tVar.e());
    }

    private final void I1() {
        androidx.compose.ui.semantics.a aVar;
        ld.l lVar;
        Iterator<e5> it = n0().values().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.semantics.l unmergedConfig = it.next().getSemanticsNode().getUnmergedConfig();
            if (kotlin.jvm.internal.l0.g(androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.t.f20369a.r()), Boolean.FALSE) && (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.k.f20321a.A())) != null && (lVar = (ld.l) aVar.a()) != null) {
            }
        }
    }

    private final boolean J0() {
        return K0() || L0();
    }

    private final List<androidx.compose.ui.semantics.p> J1(boolean layoutIsRtl, ArrayList<androidx.compose.ui.semantics.p> parentListToSort, Map<Integer, List<androidx.compose.ui.semantics.p>> containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int J = kotlin.collections.w.J(parentListToSort);
        int i4 = 0;
        if (J >= 0) {
            int i5 = 0;
            while (true) {
                androidx.compose.ui.semantics.p pVar = parentListToSort.get(i5);
                if (i5 == 0 || !M1(arrayList, pVar)) {
                    arrayList.add(new kotlin.q0(pVar.k(), kotlin.collections.w.S(pVar)));
                }
                if (i5 == J) {
                    break;
                }
                i5++;
            }
        }
        kotlin.collections.w.p0(arrayList, j.f19663b);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            kotlin.q0 q0Var = (kotlin.q0) arrayList.get(i6);
            List list = (List) q0Var.f();
            Comparator comparator = layoutIsRtl ? h.f19659b : f.f19652b;
            androidx.compose.ui.node.h0.INSTANCE.getClass();
            kotlin.collections.w.p0(list, new s(new r(comparator, androidx.compose.ui.node.h0.R)));
            arrayList2.addAll((Collection) q0Var.f());
        }
        final v vVar = v.f19681b;
        kotlin.collections.w.p0(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int L1;
                L1 = AndroidComposeViewAccessibilityDelegateCompat.L1(ld.p.this, obj, obj2);
                return L1;
            }
        });
        while (i4 <= kotlin.collections.w.J(arrayList2)) {
            List<androidx.compose.ui.semantics.p> list2 = containerChildrenMapping.get(Integer.valueOf(((androidx.compose.ui.semantics.p) arrayList2.get(i4)).getId()));
            if (list2 != null) {
                if (N0((androidx.compose.ui.semantics.p) arrayList2.get(i4))) {
                    i4++;
                } else {
                    arrayList2.remove(i4);
                }
                arrayList2.addAll(i4, list2);
                i4 += list2.size();
            } else {
                i4++;
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List K1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z4, ArrayList arrayList, Map map, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.J1(z4, arrayList, map);
    }

    private final boolean L0() {
        return !c0.v() && (this.contentCaptureSession != null || this.contentCaptureForceEnabledForTesting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L1(ld.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private static /* synthetic */ void M0() {
    }

    private static final boolean M1(ArrayList<kotlin.q0<i0.i, List<androidx.compose.ui.semantics.p>>> arrayList, androidx.compose.ui.semantics.p pVar) {
        float top2 = pVar.k().getTop();
        float j4 = pVar.k().j();
        boolean z4 = top2 >= j4;
        int J = kotlin.collections.w.J(arrayList);
        if (J >= 0) {
            int i4 = 0;
            while (true) {
                i0.i e4 = arrayList.get(i4).e();
                boolean z5 = e4.getTop() >= e4.j();
                if (!z4 && !z5 && Math.max(top2, e4.getTop()) < Math.min(j4, e4.j())) {
                    arrayList.set(i4, new kotlin.q0<>(e4.J(0.0f, top2, Float.POSITIVE_INFINITY, j4), arrayList.get(i4).f()));
                    arrayList.get(i4).f().add(pVar);
                    return true;
                }
                if (i4 == J) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    private final boolean N0(androidx.compose.ui.semantics.p node) {
        String x4;
        x4 = c0.x(node);
        boolean z4 = (x4 == null && w0(node) == null && v0(node) == null && !u0(node)) ? false : true;
        if (node.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
            return true;
        }
        return node.F() && z4;
    }

    private final List<androidx.compose.ui.semantics.p> N1(boolean layoutIsRtl, List<androidx.compose.ui.semantics.p> listToSort) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<androidx.compose.ui.semantics.p> arrayList = new ArrayList<>();
        int size = listToSort.size();
        for (int i4 = 0; i4 < size; i4++) {
            e0(listToSort.get(i4), arrayList, linkedHashMap);
        }
        return J1(layoutIsRtl, arrayList, linkedHashMap);
    }

    private final boolean O0() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    private final RectF O1(androidx.compose.ui.semantics.p textNode, i0.i bounds) {
        if (textNode == null) {
            return null;
        }
        i0.i T = bounds.T(textNode.u());
        i0.i j4 = textNode.j();
        i0.i K = T.R(j4) ? T.K(j4) : null;
        if (K == null) {
            return null;
        }
        long e02 = this.view.e0(i0.g.a(K.t(), K.getTop()));
        long e03 = this.view.e0(i0.g.a(K.x(), K.j()));
        return new RectF(i0.f.p(e02), i0.f.r(e02), i0.f.p(e03), i0.f.r(e03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) {
        androidx.compose.ui.semantics.p semanticsNode;
        androidx.compose.ui.text.n0 C0;
        e5 e5Var = n0().get(Integer.valueOf(virtualViewId));
        if (e5Var == null || (semanticsNode = e5Var.getSemanticsNode()) == null) {
            return;
        }
        String x02 = x0(semanticsNode);
        if (kotlin.jvm.internal.l0.g(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            Integer num = this.idToBeforeMap.get(Integer.valueOf(virtualViewId));
            if (num != null) {
                info.getExtras().putInt(extraDataKey, num.intValue());
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l0.g(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            Integer num2 = this.idToAfterMap.get(Integer.valueOf(virtualViewId));
            if (num2 != null) {
                info.getExtras().putInt(extraDataKey, num2.intValue());
                return;
            }
            return;
        }
        if (!semanticsNode.getUnmergedConfig().f(androidx.compose.ui.semantics.k.f20321a.h()) || arguments == null || !kotlin.jvm.internal.l0.g(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            androidx.compose.ui.semantics.l unmergedConfig = semanticsNode.getUnmergedConfig();
            androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
            if (!unmergedConfig.f(tVar.B()) || arguments == null || !kotlin.jvm.internal.l0.g(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.l0.g(extraDataKey, "androidx.compose.ui.semantics.id")) {
                    info.getExtras().putInt(extraDataKey, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str = (String) androidx.compose.ui.semantics.m.a(semanticsNode.getUnmergedConfig(), tVar.B());
                if (str != null) {
                    info.getExtras().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
        }
        int i4 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 <= 0 || i4 < 0) {
            return;
        }
        if (i4 < (x02 != null ? x02.length() : Integer.MAX_VALUE) && (C0 = C0(semanticsNode.getUnmergedConfig())) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i4 + i6;
                if (i7 >= C0.getLayoutInput().getText().length()) {
                    arrayList.add(null);
                } else {
                    arrayList.add(O1(semanticsNode, C0.d(i7)));
                }
            }
            info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
        }
    }

    private final void P0() {
        androidx.compose.ui.platform.coreshims.d dVar = this.contentCaptureSession;
        if (dVar != null && Build.VERSION.SDK_INT >= 29) {
            if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
                List V5 = kotlin.collections.w.V5(this.bufferedContentCaptureAppearedNodes.values());
                ArrayList arrayList = new ArrayList(V5.size());
                int size = V5.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((androidx.compose.ui.platform.coreshims.f) V5.get(i4)).f());
                }
                dVar.d(arrayList);
                this.bufferedContentCaptureAppearedNodes.clear();
            }
            if (this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
                return;
            }
            List V52 = kotlin.collections.w.V5(this.bufferedContentCaptureDisappearedNodes);
            ArrayList arrayList2 = new ArrayList(V52.size());
            int size2 = V52.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList2.add(Long.valueOf(((Number) V52.get(i5)).intValue()));
            }
            dVar.e(kotlin.collections.w.W5(arrayList2));
            this.bufferedContentCaptureDisappearedNodes.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r1 = androidx.compose.ui.platform.c0.M(r1.getValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.platform.coreshims.f P1(androidx.compose.ui.semantics.p r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.P1(androidx.compose.ui.semantics.p):androidx.compose.ui.platform.coreshims.f");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect Q(e5 node) {
        Rect adjustedBounds = node.getAdjustedBounds();
        long e02 = this.view.e0(i0.g.a(adjustedBounds.left, adjustedBounds.top));
        long e03 = this.view.e0(i0.g.a(adjustedBounds.right, adjustedBounds.bottom));
        return new Rect((int) Math.floor(i0.f.p(e02)), (int) Math.floor(i0.f.r(e02)), (int) Math.ceil(i0.f.p(e03)), (int) Math.ceil(i0.f.r(e03)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(androidx.compose.ui.node.h0 layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.M(kotlin.k2.f75408a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z4) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean R1(androidx.compose.ui.semantics.p node, int granularity, boolean forward, boolean extendSelection) {
        int i4;
        int i5;
        int id2 = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id2 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String x02 = x0(node);
        boolean z4 = false;
        if (x02 != null && x02.length() != 0) {
            a.f y02 = y0(node, granularity);
            if (y02 == null) {
                return false;
            }
            int g02 = g0(node);
            if (g02 == -1) {
                g02 = forward ? 0 : x02.length();
            }
            int[] a5 = forward ? y02.a(g02) : y02.b(g02);
            if (a5 == null) {
                return false;
            }
            int i6 = a5[0];
            z4 = true;
            int i7 = a5[1];
            if (extendSelection && I0(node)) {
                i4 = h0(node);
                if (i4 == -1) {
                    i4 = forward ? i6 : i7;
                }
                i5 = forward ? i7 : i6;
            } else {
                i4 = forward ? i7 : i6;
                i5 = i4;
            }
            this.pendingTextTraversedEvent = new g(node, forward ? 256 : 512, granularity, i6, i7, SystemClock.uptimeMillis());
            w1(node, i4, i5, true);
        }
        return z4;
    }

    private final void S(int virtualId, androidx.compose.ui.platform.coreshims.f viewStructure) {
        if (viewStructure == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(Integer.valueOf(virtualId))) {
            this.bufferedContentCaptureDisappearedNodes.remove(Integer.valueOf(virtualId));
        } else {
            this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(virtualId), viewStructure);
        }
    }

    private final <T extends CharSequence> T S1(T text, @androidx.annotation.g0(from = 1) int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i4 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i4)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i4;
        }
        T t4 = (T) text.subSequence(0, size);
        kotlin.jvm.internal.l0.n(t4, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t4;
    }

    private final void T(int virtualId) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(Integer.valueOf(virtualId))) {
            this.bufferedContentCaptureAppearedNodes.remove(Integer.valueOf(virtualId));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(virtualId));
        }
    }

    private final void T1(androidx.compose.ui.semantics.p node) {
        if (L0()) {
            X1(node);
            S(node.getId(), P1(node));
            List<androidx.compose.ui.semantics.p> w4 = node.w();
            int size = w4.size();
            for (int i4 = 0; i4 < size; i4++) {
                T1(w4.get(i4));
            }
        }
    }

    private final void U1(androidx.compose.ui.semantics.p node) {
        if (L0()) {
            T(node.getId());
            List<androidx.compose.ui.semantics.p> w4 = node.w();
            int size = w4.size();
            for (int i4 = 0; i4 < size; i4++) {
                U1(w4.get(i4));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:15:0x003f->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean V(java.util.Collection<androidx.compose.ui.platform.e5> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            i0.f$a r0 = i0.f.INSTANCE
            r0.getClass()
            long r0 = i0.f.b()
            boolean r0 = i0.f.l(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lc0
            boolean r0 = i0.f.t(r9)
            if (r0 != 0) goto L18
            goto Lc0
        L18:
            r0 = 1
            if (r7 != r0) goto L22
            androidx.compose.ui.semantics.t r7 = androidx.compose.ui.semantics.t.f20369a
            androidx.compose.ui.semantics.y r7 = r7.H()
            goto L2a
        L22:
            if (r7 != 0) goto Lba
            androidx.compose.ui.semantics.t r7 = androidx.compose.ui.semantics.t.f20369a
            androidx.compose.ui.semantics.y r7 = r7.i()
        L2a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L3b
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3b
            goto Lb9
        L3b:
            java.util.Iterator r6 = r6.iterator()
        L3f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.e5 r2 = (androidx.compose.ui.platform.e5) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            i0.i r3 = androidx.compose.ui.graphics.q5.e(r3)
            boolean r3 = r3.f(r9)
            if (r3 != 0) goto L5b
        L59:
            r2 = r1
            goto Lb6
        L5b:
            androidx.compose.ui.semantics.p r2 = r2.getSemanticsNode()
            androidx.compose.ui.semantics.l r2 = r2.n()
            java.lang.Object r2 = androidx.compose.ui.semantics.m.a(r2, r7)
            androidx.compose.ui.semantics.j r2 = (androidx.compose.ui.semantics.j) r2
            if (r2 != 0) goto L6c
            goto L59
        L6c:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L74
            int r3 = -r8
            goto L75
        L74:
            r3 = r8
        L75:
            if (r8 != 0) goto L7e
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L7e
            r3 = -1
        L7e:
            if (r3 >= 0) goto L95
            ld.a r2 = r2.c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L59
        L93:
            r2 = r0
            goto Lb6
        L95:
            ld.a r3 = r2.c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            ld.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L59
            goto L93
        Lb6:
            if (r2 == 0) goto L3f
            r1 = r0
        Lb9:
            return r1
        Lba:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.V(java.util.Collection, boolean, int, long):boolean");
    }

    private final void V1(int virtualViewId) {
        int i4 = this.hoveredVirtualViewId;
        if (i4 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        p1(this, virtualViewId, 128, null, null, 12, null);
        p1(this, i4, 256, null, null, 12, null);
    }

    private final void W() {
        if (K0()) {
            k1(this.view.getSemanticsOwner().b(), this.previousSemanticsRoot);
        }
        if (L0()) {
            l1(this.view.getSemanticsOwner().b(), this.previousSemanticsRoot);
        }
        s1(n0());
        W1();
    }

    private final void W1() {
        boolean A;
        androidx.compose.ui.semantics.l unmergedConfig;
        boolean A2;
        androidx.collection.d<? extends Integer> dVar = new androidx.collection.d<>(0, 1, null);
        Iterator<Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            e5 e5Var = n0().get(Integer.valueOf(intValue));
            androidx.compose.ui.semantics.p semanticsNode = e5Var != null ? e5Var.getSemanticsNode() : null;
            if (semanticsNode != null) {
                A2 = c0.A(semanticsNode);
                if (!A2) {
                }
            }
            dVar.add(Integer.valueOf(intValue));
            i iVar = this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            q1(intValue, 32, (iVar == null || (unmergedConfig = iVar.getUnmergedConfig()) == null) ? null : (String) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.t.f20369a.u()));
        }
        this.paneDisplayed.l(dVar);
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, e5> entry : n0().entrySet()) {
            A = c0.A(entry.getValue().getSemanticsNode());
            if (A && this.paneDisplayed.add(entry.getKey())) {
                q1(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig().j(androidx.compose.ui.semantics.t.f20369a.u()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new i(entry.getValue().getSemanticsNode(), n0()));
        }
        this.previousSemanticsRoot = new i(this.view.getSemanticsOwner().b(), n0());
    }

    private final boolean X(int virtualViewId) {
        if (!H0(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        p1(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    private final void X1(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.semantics.a aVar;
        ld.l lVar;
        ld.l lVar2;
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        Boolean bool = (Boolean) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.t.f20369a.r());
        if (this.translateStatus == k.SHOW_ORIGINAL && kotlin.jvm.internal.l0.g(bool, Boolean.TRUE)) {
            androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.k.f20321a.A());
            if (aVar2 == null || (lVar2 = (ld.l) aVar2.a()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != k.SHOW_TRANSLATED || !kotlin.jvm.internal.l0.g(bool, Boolean.FALSE) || (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.k.f20321a.A())) == null || (lVar = (ld.l) aVar.a()) == null) {
            return;
        }
    }

    private final void Y() {
        androidx.compose.ui.semantics.a aVar;
        ld.a aVar2;
        Iterator<e5> it = n0().values().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.semantics.l unmergedConfig = it.next().getSemanticsNode().getUnmergedConfig();
            if (androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.t.f20369a.r()) != null && (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.m.a(unmergedConfig, androidx.compose.ui.semantics.k.f20321a.a())) != null && (aVar2 = (ld.a) aVar.a()) != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01ab -> B:86:0x01ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y0(int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Y0(int, int, android.os.Bundle):boolean");
    }

    @androidx.annotation.m1
    private final AccessibilityEvent Z(int virtualViewId, int eventType) {
        e5 e5Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(eventType);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, virtualViewId);
        if (K0() && (e5Var = n0().get(Integer.valueOf(virtualViewId))) != null) {
            obtain.setPassword(e5Var.getSemanticsNode().n().f(androidx.compose.ui.semantics.t.f20369a.v()));
        }
        return obtain;
    }

    private static final boolean Z0(androidx.compose.ui.semantics.j jVar, float f4) {
        return (f4 < 0.0f && jVar.c().invoke().floatValue() > 0.0f) || (f4 > 0.0f && jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfo a0(int virtualViewId) {
        InterfaceC1423e0 lifecycleOwner;
        AbstractC1450w lifecycle;
        AndroidComposeView.c W0 = this.view.W0();
        if (((W0 == null || (lifecycleOwner = W0.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == AbstractC1450w.b.DESTROYED) {
            return null;
        }
        androidx.core.view.accessibility.h0 N0 = androidx.core.view.accessibility.h0.N0();
        e5 e5Var = n0().get(Integer.valueOf(virtualViewId));
        if (e5Var == null) {
            return null;
        }
        androidx.compose.ui.semantics.p semanticsNode = e5Var.getSemanticsNode();
        if (virtualViewId == -1) {
            ViewParent o02 = androidx.core.view.x1.o0(this.view);
            N0.P1(o02 instanceof View ? (View) o02 : null);
        } else {
            androidx.compose.ui.semantics.p t4 = semanticsNode.t();
            Integer valueOf = t4 != null ? Integer.valueOf(t4.getId()) : null;
            if (valueOf == null) {
                throw new IllegalStateException(androidx.collection.r2.a("semanticsNode ", virtualViewId, " has null parent").toString());
            }
            int intValue = valueOf.intValue();
            N0.Q1(this.view, intValue != this.view.getSemanticsOwner().b().getId() ? intValue : -1);
        }
        N0.b2(this.view, virtualViewId);
        N0.e1(Q(e5Var));
        b1(virtualViewId, N0, semanticsNode);
        return N0.q2();
    }

    private static final float a1(float f4, float f5) {
        if (Math.signum(f4) == Math.signum(f5)) {
            return Math.abs(f4) < Math.abs(f5) ? f4 : f5;
        }
        return 0.0f;
    }

    private final AccessibilityEvent b0(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent Z2 = Z(virtualViewId, 8192);
        if (fromIndex != null) {
            Z2.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            Z2.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            Z2.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            Z2.getText().add(text);
        }
        return Z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x02b4, code lost:
    
        if (androidx.compose.ui.semantics.g.f(r4, androidx.compose.ui.semantics.g.f20300d) != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b1(int r17, androidx.core.view.accessibility.h0 r18, androidx.compose.ui.semantics.p r19) {
        /*
            Method dump skipped, instructions count: 2181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.b1(int, androidx.core.view.accessibility.h0, androidx.compose.ui.semantics.p):void");
    }

    private static final boolean c1(androidx.compose.ui.semantics.j jVar) {
        return (jVar.c().invoke().floatValue() > 0.0f && !jVar.getReverseScrolling()) || (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && jVar.getReverseScrolling());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z4) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z4 ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : kotlin.collections.j0.f74919b;
    }

    private static final boolean d1(androidx.compose.ui.semantics.j jVar) {
        return (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && !jVar.getReverseScrolling()) || (jVar.c().invoke().floatValue() > 0.0f && jVar.getReverseScrolling());
    }

    private final void e0(androidx.compose.ui.semantics.p currNode, ArrayList<androidx.compose.ui.semantics.p> geometryList, Map<Integer, List<androidx.compose.ui.semantics.p>> containerMapToChildren) {
        boolean z4 = currNode.p().getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        boolean booleanValue = ((Boolean) currNode.n().l(androidx.compose.ui.semantics.t.f20369a.s(), c0.b.f19785b)).booleanValue();
        if ((booleanValue || N0(currNode)) && n0().keySet().contains(Integer.valueOf(currNode.getId()))) {
            geometryList.add(currNode);
        }
        if (booleanValue) {
            containerMapToChildren.put(Integer.valueOf(currNode.getId()), N1(z4, kotlin.collections.w.Y5(currNode.l())));
            return;
        }
        List<androidx.compose.ui.semantics.p> l4 = currNode.l();
        int size = l4.size();
        for (int i4 = 0; i4 < size; i4++) {
            e0(l4.get(i4), geometryList, containerMapToChildren);
        }
    }

    private final boolean e1(int id2, List<d5> oldScrollObservationScopes) {
        d5 r4;
        boolean z4;
        r4 = c0.r(oldScrollObservationScopes, id2);
        if (r4 != null) {
            z4 = false;
        } else {
            r4 = new d5(id2, this.scrollObservationScopes, null, null, null, null);
            z4 = true;
        }
        this.scrollObservationScopes.add(r4);
        return z4;
    }

    private final boolean f1(int virtualViewId) {
        if (!O0() || H0(virtualViewId)) {
            return false;
        }
        int i4 = this.focusedVirtualViewId;
        if (i4 != Integer.MIN_VALUE) {
            p1(this, i4, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        p1(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    private final int g0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        return (unmergedConfig.f(tVar.c()) || !node.getUnmergedConfig().f(tVar.D())) ? this.accessibilityCursorPosition : (int) (((androidx.compose.ui.text.t0) node.getUnmergedConfig().j(tVar.D())).getPackedValue() & 4294967295L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1(d5 scrollObservationScope) {
        if (scrollObservationScope.G3()) {
            this.view.getSnapshotObserver().i(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new p(scrollObservationScope, this));
        }
    }

    private final int h0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        return (unmergedConfig.f(tVar.c()) || !node.getUnmergedConfig().f(tVar.D())) ? this.accessibilityCursorPosition : (int) (((androidx.compose.ui.text.t0) node.getUnmergedConfig().j(tVar.D())).getPackedValue() >> 32);
    }

    private final Comparator<androidx.compose.ui.semantics.p> h1(boolean layoutIsRtl) {
        Comparator comparator = layoutIsRtl ? h.f19659b : f.f19652b;
        androidx.compose.ui.node.h0.INSTANCE.getClass();
        return new s(new r(comparator, androidx.compose.ui.node.h0.R));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        androidx.compose.ui.node.p1.s(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
        androidComposeViewAccessibilityDelegateCompat.W();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void j0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j1(int id2) {
        if (id2 == this.view.getSemanticsOwner().b().getId()) {
            return -1;
        }
        return id2;
    }

    private final void k1(androidx.compose.ui.semantics.p newNode, i oldNode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<androidx.compose.ui.semantics.p> w4 = newNode.w();
        int size = w4.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.semantics.p pVar = w4.get(i4);
            if (n0().containsKey(Integer.valueOf(pVar.getId()))) {
                if (!oldNode.a().contains(Integer.valueOf(pVar.getId()))) {
                    Q0(newNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(pVar.getId()));
            }
        }
        Iterator<Integer> it = oldNode.a().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                Q0(newNode.getLayoutNode());
                return;
            }
        }
        List<androidx.compose.ui.semantics.p> w5 = newNode.w();
        int size2 = w5.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.semantics.p pVar2 = w5.get(i5);
            if (n0().containsKey(Integer.valueOf(pVar2.getId()))) {
                i iVar = this.previousSemanticsNodes.get(Integer.valueOf(pVar2.getId()));
                kotlin.jvm.internal.l0.m(iVar);
                k1(pVar2, iVar);
            }
        }
    }

    @androidx.annotation.m1
    public static /* synthetic */ void l0() {
    }

    private final void l1(androidx.compose.ui.semantics.p newNode, i oldNode) {
        List<androidx.compose.ui.semantics.p> w4 = newNode.w();
        int size = w4.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.semantics.p pVar = w4.get(i4);
            if (n0().containsKey(Integer.valueOf(pVar.getId())) && !oldNode.a().contains(Integer.valueOf(pVar.getId()))) {
                T1(pVar);
            }
        }
        for (Map.Entry<Integer, i> entry : this.previousSemanticsNodes.entrySet()) {
            if (!n0().containsKey(entry.getKey())) {
                T(entry.getKey().intValue());
            }
        }
        List<androidx.compose.ui.semantics.p> w5 = newNode.w();
        int size2 = w5.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.semantics.p pVar2 = w5.get(i5);
            if (n0().containsKey(Integer.valueOf(pVar2.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(pVar2.getId()))) {
                i iVar = this.previousSemanticsNodes.get(Integer.valueOf(pVar2.getId()));
                kotlin.jvm.internal.l0.m(iVar);
                l1(pVar2, iVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.coreshims.d m0(View view) {
        androidx.compose.ui.platform.coreshims.e.c(view, 1);
        return androidx.compose.ui.platform.coreshims.e.b(view);
    }

    private final void m1(int id2, String newText) {
        androidx.compose.ui.platform.coreshims.d dVar = this.contentCaptureSession;
        if (dVar != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId a5 = dVar.a(id2);
            if (a5 == null) {
                throw new IllegalStateException("Invalid content capture ID");
            }
            dVar.c(a5, newText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, e5> n0() {
        Map<Integer, e5> t4;
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            t4 = c0.t(this.view.getSemanticsOwner());
            this.currentSemanticsNodes = t4;
            if (K0()) {
                H1();
            }
        }
        return this.currentSemanticsNodes;
    }

    private final boolean n1(AccessibilityEvent event) {
        if (!K0()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean o1(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !J0()) {
            return false;
        }
        AccessibilityEvent Z2 = Z(virtualViewId, eventType);
        if (contentChangeType != null) {
            Z2.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            Z2.setContentDescription(androidx.compose.ui.util.c.q(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return n1(Z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean p1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i4, int i5, Integer num, List list, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            num = null;
        }
        if ((i6 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.o1(i4, i5, num, list);
    }

    private final void q1(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent Z2 = Z(j1(semanticsNodeId), 32);
        Z2.setContentChangeTypes(contentChangeType);
        if (title != null) {
            Z2.getText().add(title);
        }
        n1(Z2);
    }

    @androidx.annotation.m1
    public static /* synthetic */ void r0() {
    }

    private final void r1(int semanticsNodeId) {
        g gVar = this.pendingTextTraversedEvent;
        if (gVar != null) {
            if (semanticsNodeId != gVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.getTraverseTime() <= 1000) {
                AccessibilityEvent Z2 = Z(j1(gVar.getNode().getId()), 131072);
                Z2.setFromIndex(gVar.getFromIndex());
                Z2.setToIndex(gVar.getToIndex());
                Z2.setAction(gVar.getAction());
                Z2.setMovementGranularity(gVar.getGranularity());
                Z2.getText().add(x0(gVar.getNode()));
                n1(Z2);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x05c6, code lost:
    
        if (r0.containsAll(r2) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x05c9, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0609, code lost:
    
        if (r0 == false) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x041d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s1(java.util.Map<java.lang.Integer, androidx.compose.ui.platform.e5> r28) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.s1(java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r0 = androidx.compose.ui.platform.c0.s(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.t.f19679b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t1(androidx.compose.ui.node.h0 r8, androidx.collection.d<java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r8.f()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.view
            androidx.compose.ui.platform.z0 r0 = r0.P0()
            java.util.HashMap r0 = r0.c()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            androidx.collection.d<androidx.compose.ui.node.h0> r0 = r7.subtreeChangedLayoutNodes
            int r0 = r0.size()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L33
            androidx.collection.d<androidx.compose.ui.node.h0> r2 = r7.subtreeChangedLayoutNodes
            java.lang.Object r2 = r2.s(r1)
            androidx.compose.ui.node.h0 r2 = (androidx.compose.ui.node.h0) r2
            boolean r2 = androidx.compose.ui.platform.c0.j(r2, r8)
            if (r2 == 0) goto L30
            return
        L30:
            int r1 = r1 + 1
            goto L1f
        L33:
            androidx.compose.ui.node.c1 r0 = r8.getNodes()
            r1 = 8
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L40
            goto L46
        L40:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$u r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.u.f19680b
            androidx.compose.ui.node.h0 r8 = androidx.compose.ui.platform.c0.e(r8, r0)
        L46:
            if (r8 == 0) goto L80
            androidx.compose.ui.semantics.l r0 = r8.Z()
            if (r0 != 0) goto L4f
            goto L80
        L4f:
            boolean r0 = r0.getIsMergingSemanticsOfDescendants()
            if (r0 != 0) goto L5e
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$t r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.t.f19679b
            androidx.compose.ui.node.h0 r0 = androidx.compose.ui.platform.c0.e(r8, r0)
            if (r0 == 0) goto L5e
            r8 = r0
        L5e:
            int r8 = r8.getSemanticsId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L6d
            return
        L6d:
            int r1 = r7.j1(r8)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r7
            p1(r0, r1, r2, r3, r4, r5, r6)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.t1(androidx.compose.ui.node.h0, androidx.collection.d):void");
    }

    private final boolean u0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        p0.a aVar = (p0.a) androidx.compose.ui.semantics.m.a(unmergedConfig, tVar.F());
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.x());
        boolean z4 = aVar != null;
        if (((Boolean) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.z())) == null) {
            return z4;
        }
        androidx.compose.ui.semantics.i.INSTANCE.getClass();
        return iVar != null ? androidx.compose.ui.semantics.i.k(iVar.getValue(), androidx.compose.ui.semantics.i.f20313g) : false ? z4 : true;
    }

    private final void u1(androidx.compose.ui.node.h0 layoutNode) {
        if (layoutNode.f() && !this.view.P0().c().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            androidx.compose.ui.semantics.j jVar = this.pendingHorizontalScrollEvents.get(Integer.valueOf(semanticsId));
            androidx.compose.ui.semantics.j jVar2 = this.pendingVerticalScrollEvents.get(Integer.valueOf(semanticsId));
            if (jVar == null && jVar2 == null) {
                return;
            }
            AccessibilityEvent Z2 = Z(semanticsId, 4096);
            if (jVar != null) {
                Z2.setScrollX((int) jVar.c().invoke().floatValue());
                Z2.setMaxScrollX((int) jVar.a().invoke().floatValue());
            }
            if (jVar2 != null) {
                Z2.setScrollY((int) jVar2.c().invoke().floatValue());
                Z2.setMaxScrollY((int) jVar2.a().invoke().floatValue());
            }
            n1(Z2);
        }
    }

    private final String v0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        Object a5 = androidx.compose.ui.semantics.m.a(unmergedConfig, tVar.A());
        p0.a aVar = (p0.a) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.F());
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.x());
        if (aVar != null) {
            int i4 = m.f19665a[aVar.ordinal()];
            if (i4 == 1) {
                androidx.compose.ui.semantics.i.INSTANCE.getClass();
                if ((iVar == null ? false : androidx.compose.ui.semantics.i.k(iVar.getValue(), androidx.compose.ui.semantics.i.f20311e)) && a5 == null) {
                    a5 = this.view.getContext().getResources().getString(t.c.f20454k);
                }
            } else if (i4 == 2) {
                androidx.compose.ui.semantics.i.INSTANCE.getClass();
                if ((iVar == null ? false : androidx.compose.ui.semantics.i.k(iVar.getValue(), androidx.compose.ui.semantics.i.f20311e)) && a5 == null) {
                    a5 = this.view.getContext().getResources().getString(t.c.f20453j);
                }
            } else if (i4 == 3 && a5 == null) {
                a5 = this.view.getContext().getResources().getString(t.c.f20450g);
            }
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.z());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            if (!(iVar == null ? false : androidx.compose.ui.semantics.i.k(iVar.getValue(), androidx.compose.ui.semantics.i.f20313g)) && a5 == null) {
                a5 = booleanValue ? this.view.getContext().getResources().getString(t.c.f20457n) : this.view.getContext().getResources().getString(t.c.f20452i);
            }
        }
        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.w());
        if (hVar != null) {
            androidx.compose.ui.semantics.h.INSTANCE.getClass();
            if (hVar != androidx.compose.ui.semantics.h.f20304f) {
                if (a5 == null) {
                    kotlin.ranges.f<Float> c5 = hVar.c();
                    float H = kotlin.ranges.s.H(((c5.h().floatValue() - c5.c().floatValue()) > 0.0f ? 1 : ((c5.h().floatValue() - c5.c().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (hVar.getCurrent() - c5.c().floatValue()) / (c5.h().floatValue() - c5.c().floatValue()), 0.0f, 1.0f);
                    if (!(H == 0.0f)) {
                        r5 = (H == 1.0f ? 1 : 0) != 0 ? 100 : kotlin.ranges.s.I(kotlin.math.b.L0(H * 100), 1, 99);
                    }
                    a5 = this.view.getContext().getResources().getString(t.c.f20460q, Integer.valueOf(r5));
                }
            } else if (a5 == null) {
                a5 = this.view.getContext().getResources().getString(t.c.f20449f);
            }
        }
        return (String) a5;
    }

    private final SpannableString w0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.text.e eVar;
        y.b K = this.view.K();
        androidx.compose.ui.text.e B0 = B0(node.getUnmergedConfig());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) S1(B0 != null ? androidx.compose.ui.text.platform.a.b(B0, this.view.getDensity(), K, this.urlSpanCache) : null, Q2);
        List list = (List) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), androidx.compose.ui.semantics.t.f20369a.C());
        if (list != null && (eVar = (androidx.compose.ui.text.e) kotlin.collections.w.G2(list)) != null) {
            spannableString = androidx.compose.ui.text.platform.a.b(eVar, this.view.getDensity(), K, this.urlSpanCache);
        }
        return spannableString2 == null ? (SpannableString) S1(spannableString, Q2) : spannableString2;
    }

    private final boolean w1(androidx.compose.ui.semantics.p node, int start, int end, boolean traversalMode) {
        String x02;
        boolean p4;
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.k kVar = androidx.compose.ui.semantics.k.f20321a;
        if (unmergedConfig.f(kVar.x())) {
            p4 = c0.p(node);
            if (p4) {
                ld.q qVar = (ld.q) ((androidx.compose.ui.semantics.a) node.getUnmergedConfig().j(kVar.x())).a();
                if (qVar != null) {
                    return ((Boolean) qVar.R(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
                }
                return false;
            }
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (x02 = x0(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > x02.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z4 = x02.length() > 0;
        n1(b0(j1(node.getId()), z4 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z4 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z4 ? Integer.valueOf(x02.length()) : null, x02));
        r1(node.getId());
        return true;
    }

    private final String x0(androidx.compose.ui.semantics.p node) {
        androidx.compose.ui.text.e eVar;
        if (node == null) {
            return null;
        }
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        if (unmergedConfig.f(tVar.c())) {
            return androidx.compose.ui.util.c.q((List) node.getUnmergedConfig().j(tVar.c()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().f(androidx.compose.ui.semantics.k.f20321a.y())) {
            androidx.compose.ui.text.e B0 = B0(node.getUnmergedConfig());
            if (B0 != null) {
                return B0.getText();
            }
            return null;
        }
        List list = (List) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.C());
        if (list == null || (eVar = (androidx.compose.ui.text.e) kotlin.collections.w.G2(list)) == null) {
            return null;
        }
        return eVar.getText();
    }

    private final a.f y0(androidx.compose.ui.semantics.p node, int granularity) {
        String x02;
        androidx.compose.ui.text.n0 C0;
        if (node == null || (x02 = x0(node)) == null || x02.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            a.b a5 = a.b.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            a5.e(x02);
            return a5;
        }
        if (granularity == 2) {
            a.g a6 = a.g.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            a6.e(x02);
            return a6;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                a.e a7 = a.e.INSTANCE.a();
                a7.e(x02);
                return a7;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().f(androidx.compose.ui.semantics.k.f20321a.h()) || (C0 = C0(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            a.c a8 = a.c.INSTANCE.a();
            a8.j(x02, C0);
            return a8;
        }
        a.d a10 = a.d.INSTANCE.a();
        a10.j(x02, C0, node);
        return a10;
    }

    private final void z1(androidx.compose.ui.semantics.p node, androidx.core.view.accessibility.h0 info) {
        androidx.compose.ui.semantics.l unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.t tVar = androidx.compose.ui.semantics.t.f20369a;
        if (unmergedConfig.f(tVar.f())) {
            info.p1(true);
            info.v1((CharSequence) androidx.compose.ui.semantics.m.a(node.getUnmergedConfig(), tVar.f()));
        }
    }

    public final void A1(int i4) {
        this.hoveredVirtualViewId = i4;
    }

    public final void B1(@fg.l HashMap<Integer, Integer> hashMap) {
        this.idToAfterMap = hashMap;
    }

    public final void C1(@fg.l HashMap<Integer, Integer> hashMap) {
        this.idToBeforeMap = hashMap;
    }

    @fg.l
    /* renamed from: D0, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final void E1(@fg.l ld.l<? super AccessibilityEvent, Boolean> lVar) {
        this.onSendAccessibilityEvent = lVar;
    }

    @androidx.annotation.m1
    public final int F0(float x4, float y4) {
        androidx.compose.ui.node.c1 nodes;
        boolean H;
        androidx.compose.ui.node.p1.s(this.view, false, 1, null);
        androidx.compose.ui.node.t tVar = new androidx.compose.ui.node.t();
        this.view.getRoot().K0(i0.g.a(x4, y4), tVar, (r13 & 4) != 0, (r13 & 8) != 0);
        q.d dVar = (q.d) kotlin.collections.w.v3(tVar);
        androidx.compose.ui.node.h0 p4 = dVar != null ? androidx.compose.ui.node.k.p(dVar) : null;
        if (p4 != null && (nodes = p4.getNodes()) != null && nodes.t(8)) {
            H = c0.H(androidx.compose.ui.semantics.q.a(p4, false));
            if (H && this.view.P0().c().get(p4) == null) {
                return j1(p4.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean K0() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0033, B:14:0x0063, B:19:0x0075, B:21:0x007d, B:23:0x0086, B:24:0x0089, B:26:0x008f, B:28:0x0098, B:30:0x00a9, B:32:0x00b0, B:33:0x00b9, B:42:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d6 -> B:13:0x0036). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@fg.l kotlin.coroutines.d<? super kotlin.k2> r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.R(kotlin.coroutines.d):java.lang.Object");
    }

    public final void R0() {
        this.translateStatus = k.SHOW_ORIGINAL;
        Y();
    }

    @androidx.annotation.x0(31)
    public final void S0(@fg.l long[] virtualIds, @fg.l int[] supportedFormats, @fg.l Consumer<ViewTranslationRequest> requestsCollector) {
        l.f19664a.c(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void T0() {
        this.translateStatus = k.SHOW_ORIGINAL;
        E0();
    }

    public final boolean U(boolean vertical, int direction, long position) {
        if (kotlin.jvm.internal.l0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return V(n0().values(), vertical, direction, position);
        }
        return false;
    }

    public final void U0(@fg.l androidx.compose.ui.node.h0 layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (J0()) {
            Q0(layoutNode);
        }
    }

    public final void V0() {
        this.currentSemanticsNodesInvalidated = true;
        if (!J0() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    public final void W0() {
        this.translateStatus = k.SHOW_TRANSLATED;
        I1();
    }

    @androidx.annotation.x0(31)
    public final void X0(@fg.l LongSparseArray<ViewTranslationResponse> response) {
        l.f19664a.d(this, response);
    }

    @Override // androidx.core.view.a
    @fg.l
    public androidx.core.view.accessibility.m0 b(@fg.l View host) {
        return this.nodeProvider;
    }

    public final boolean c0(@fg.l MotionEvent event) {
        if (!O0()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int F0 = F0(event.getX(), event.getY());
            boolean dispatchGenericMotionEvent = this.view.P0().dispatchGenericMotionEvent(event);
            V1(F0);
            if (F0 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.P0().dispatchGenericMotionEvent(event);
        }
        V1(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: f0, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    /* renamed from: i0, reason: from getter */
    public final boolean getContentCaptureForceEnabledForTesting() {
        return this.contentCaptureForceEnabledForTesting;
    }

    @fg.m
    /* renamed from: k0, reason: from getter */
    public final androidx.compose.ui.platform.coreshims.d getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    @fg.l
    /* renamed from: o0, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    @Override // androidx.view.InterfaceC1436l
    public void onStart(@fg.l InterfaceC1423e0 owner) {
        G0(true);
    }

    @Override // androidx.view.InterfaceC1436l
    public void onStop(@fg.l InterfaceC1423e0 owner) {
        G0(false);
    }

    @fg.l
    /* renamed from: p0, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: q0, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    @fg.l
    public final HashMap<Integer, Integer> s0() {
        return this.idToAfterMap;
    }

    @fg.l
    public final HashMap<Integer, Integer> t0() {
        return this.idToBeforeMap;
    }

    public final void v1(boolean z4) {
        this.accessibilityForceEnabledForTesting = z4;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void x1(boolean z4) {
        this.contentCaptureForceEnabledForTesting = z4;
    }

    public final void y1(@fg.m androidx.compose.ui.platform.coreshims.d dVar) {
        this.contentCaptureSession = dVar;
    }

    @fg.l
    public final ld.l<AccessibilityEvent, Boolean> z0() {
        return this.onSendAccessibilityEvent;
    }
}
