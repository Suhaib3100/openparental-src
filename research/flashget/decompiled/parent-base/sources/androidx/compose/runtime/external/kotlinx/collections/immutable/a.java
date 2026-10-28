package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import fg.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.k2;
import kotlin.q0;
import kotlin.sequences.m;
import kotlin.text.v;
import kotlin.x0;

/* compiled from: extensions.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a@\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001aZ\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0017\u0010\u0016\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a4\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\b \u0010!\u001a4\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b\"\u0010\u001b\u001a6\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\b#\u0010\u001e\u001a4\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\b$\u0010!\u001a.\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b%\u0010&\u001a.\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b'\u0010&\u001a4\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b(\u0010)\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\b\u0000\u0010*\u001a4\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\b+\u0010,\u001a4\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b-\u0010)\u001a6\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\b.\u0010*\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\b/\u0010,\u001a.\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b0\u00101\u001a.\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b2\u00101\u001a4\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b3\u00104\u001a6\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\b5\u00106\u001a4\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\b7\u00108\u001a4\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\b9\u00104\u001a6\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\b:\u00106\u001a4\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\b;\u00108\u001a4\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0004¢\u0006\u0004\b<\u00104\u001a4\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0004¢\u0006\u0004\b=\u0010>\u001aN\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?H\u0080\n¢\u0006\u0004\bA\u0010B\u001aT\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0018\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u0018H\u0080\n¢\u0006\u0004\bD\u0010E\u001aV\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u001a\u0010C\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001cH\u0080\n¢\u0006\u0004\bF\u0010G\u001aT\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0018\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001fH\u0080\n¢\u0006\u0004\bH\u0010I\u001aP\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0014\u0010K\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0080\n¢\u0006\u0004\b\r\u0010L\u001aO\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0014\u0010K\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0004\bM\u0010L\u001aS\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0018\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u0018H\u0000¢\u0006\u0004\bN\u0010E\u001aU\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u001a\u0010C\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001cH\u0000¢\u0006\u0004\bO\u0010G\u001aS\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0018\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001fH\u0000¢\u0006\u0004\bP\u0010I\u001aB\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010Q\u001a\u00028\u0000H\u0080\u0002¢\u0006\u0004\bR\u0010S\u001aH\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\u0002¢\u0006\u0004\bU\u0010E\u001aJ\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0080\u0002¢\u0006\u0004\bV\u0010W\u001aH\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\u0002¢\u0006\u0004\bX\u0010I\u001a/\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c\"\u00028\u0000H\u0000¢\u0006\u0004\bY\u0010Z\u001a\u001b\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012H\u0000¢\u0006\u0004\b[\u0010\\\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c\"\u00028\u0000H\u0000¢\u0006\u0004\b]\u0010^\u001a\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012H\u0000¢\u0006\u0004\b\f\u0010_\u001a/\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c\"\u00028\u0000H\u0000¢\u0006\u0004\b`\u0010^\u001a\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012H\u0000¢\u0006\u0004\b\u0012\u0010_\u001aS\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2*\u0010C\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001c\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?H\u0000¢\u0006\u0004\ba\u0010b\u001a'\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\rH\u0000¢\u0006\u0004\bc\u0010d\u001aS\u0010e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2*\u0010C\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001c\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?H\u0000¢\u0006\u0004\be\u0010b\u001a'\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\rH\u0000¢\u0006\u0004\bf\u0010d\u001a/\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c\"\u00028\u0000H\u0001¢\u0006\u0004\bg\u0010Z\u001a\u001b\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0012H\u0001¢\u0006\u0004\bh\u0010\\\u001a/\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c\"\u00028\u0000H\u0001¢\u0006\u0004\bi\u0010^\u001a\u001b\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0012H\u0001¢\u0006\u0004\bj\u0010_\u001a/\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c\"\u00028\u0000H\u0001¢\u0006\u0004\bk\u0010^\u001aS\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2*\u0010C\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001c\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?H\u0001¢\u0006\u0004\bl\u0010b\u001aS\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2*\u0010C\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?0\u001c\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?H\u0001¢\u0006\u0004\bm\u0010b\u001a%\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0000¢\u0006\u0004\bo\u0010p\u001a%\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0004\bq\u0010r\u001a\u0019\u0010u\u001a\b\u0012\u0004\u0012\u00020t0n*\u00020sH\u0000¢\u0006\u0004\bu\u0010v\u001a%\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0000¢\u0006\u0004\bw\u0010x\u001a%\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0004\by\u0010z\u001a\u0019\u0010{\u001a\b\u0012\u0004\u0012\u00020t0\b*\u00020sH\u0000¢\u0006\u0004\b{\u0010|\u001a%\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000}\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0000¢\u0006\u0004\b~\u0010\u007f\u001a(\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020t0\u0001*\u00020sH\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a(\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a(\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u001c\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020t0\u0001*\u00020sH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001\u001a(\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u0085\u0001\u001a(\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u001c\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020t0\u0001*\u00020sH\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u0083\u0001\u001a;\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008c\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a:\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a:\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Lkotlin/Function1;", "", "Lkotlin/k2;", "mutator", "B", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "", "z", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "", "A", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "element", "N", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "k", "", "elements", "M", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "", "P", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "Lkotlin/sequences/m;", "O", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "j", "m", "l", "R", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "o", "Q", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "S", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "n", "q", "p", "a0", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "w", "Z", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "c0", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "b0", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "v", "y", "x", "i", "h", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Lkotlin/q0;", "pair", "W", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;Lkotlin/q0;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "pairs", "U", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Y", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;[Lkotlin/q0;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "X", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "", "map", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "e0", "d0", "g0", "f0", "key", "s", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "keys", "r", "u", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "t", "H", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "G", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "L", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "F", "J", "([Lkotlin/q0;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "I", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "D", "C", "d", "c", "g", "f", "b", "e", "a", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "i0", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "j0", "(Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "", "", "h0", "(Ljava/lang/CharSequence;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "t0", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "u0", "(Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "s0", "(Ljava/lang/CharSequence;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "l0", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "m0", "(Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "n0", "(Ljava/lang/CharSequence;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "x0", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "y0", "(Lkotlin/sequences/m;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "w0", "q0", "r0", "p0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/d;", "k0", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/d;", "v0", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "o0", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/* loaded from: classes.dex */
public final class a {
    @l
    public static final <K, V> h<K, V> A(@l h<? extends K, ? extends V> hVar, @l ld.l<? super Map<K, V>, k2> lVar) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        lVar.invoke(g4);
        return g4.a2();
    }

    @l
    public static final <T> i<T> B(@l i<? extends T> iVar, @l ld.l<? super Set<T>, k2> lVar) {
        i.a<? extends T> g4 = iVar.g();
        lVar.invoke(g4);
        return g4.a();
    }

    @l
    public static final <K, V> h<K, V> C() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a();
    }

    @l
    public static final <K, V> h<K, V> D(@l q0<? extends K, ? extends V>... q0VarArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> a5 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a();
        l0.n(a5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<K, V> g4 = a5.g();
        z0.y0(g4, q0VarArr);
        return g4.a2();
    }

    @l
    public static final <E> i<E> E() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.INSTANCE.getClass();
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.f16297g;
    }

    @l
    public static final <E> i<E> F(@l E... eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.INSTANCE.getClass();
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.f16297g.addAll((Collection) kotlin.collections.l.t(eArr));
    }

    @l
    public static final <E> g<E> G() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b();
    }

    @l
    public static final <E> g<E> H(@l E... eArr) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b().addAll((Collection) kotlin.collections.l.t(eArr));
    }

    @l
    public static final <K, V> h<K, V> I() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.INSTANCE.a();
    }

    @l
    public static final <K, V> h<K, V> J(@l q0<? extends K, ? extends V>... q0VarArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c<K, V> a5 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.INSTANCE.a();
        l0.n(a5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<K, V> g4 = a5.g();
        z0.y0(g4, q0VarArr);
        return g4.a2();
    }

    @l
    public static final <E> i<E> K() {
        e0.b.INSTANCE.getClass();
        return e0.b.f73741h;
    }

    @l
    public static final <E> i<E> L(@l E... eArr) {
        e0.b.INSTANCE.getClass();
        return e0.b.f73741h.addAll((Collection) kotlin.collections.l.t(eArr));
    }

    @l
    public static final <E> f<E> M(@l f<? extends E> fVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return fVar.addAll((Collection<? extends Object>) iterable);
        }
        f.a<? extends E> g4 = fVar.g();
        w.q0(g4, iterable);
        return g4.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> f<E> N(@l f<? extends E> fVar, E e4) {
        return fVar.add((f<? extends E>) e4);
    }

    @l
    public static final <E> f<E> O(@l f<? extends E> fVar, @l m<? extends E> mVar) {
        f.a<? extends E> g4 = fVar.g();
        w.r0(g4, mVar);
        return g4.a();
    }

    @l
    public static final <E> f<E> P(@l f<? extends E> fVar, @l E[] eArr) {
        f.a<? extends E> g4 = fVar.g();
        w.s0(g4, eArr);
        return g4.a();
    }

    @l
    public static final <E> g<E> Q(@l g<? extends E> gVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return gVar.addAll((Collection<? extends Object>) iterable);
        }
        g.a<? extends E> g4 = gVar.g();
        w.q0(g4, iterable);
        return g4.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> g<E> R(@l g<? extends E> gVar, E e4) {
        return gVar.add((g<? extends E>) e4);
    }

    @l
    public static final <E> g<E> S(@l g<? extends E> gVar, @l m<? extends E> mVar) {
        g.a<? extends E> g4 = gVar.g();
        w.r0(g4, mVar);
        return g4.a();
    }

    @l
    public static final <E> g<E> T(@l g<? extends E> gVar, @l E[] eArr) {
        g.a<? extends E> g4 = gVar.g();
        w.s0(g4, eArr);
        return g4.a();
    }

    @l
    public static final <K, V> h<K, V> U(@l h<? extends K, ? extends V> hVar, @l Iterable<? extends q0<? extends K, ? extends V>> iterable) {
        return d0(hVar, iterable);
    }

    @l
    public static final <K, V> h<K, V> V(@l h<? extends K, ? extends V> hVar, @l Map<? extends K, ? extends V> map) {
        return e0(hVar, map);
    }

    @l
    public static final <K, V> h<K, V> W(@l h<? extends K, ? extends V> hVar, @l q0<? extends K, ? extends V> q0Var) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return hVar.put((h<? extends K, ? extends V>) q0Var.e(), (K) q0Var.f());
    }

    @l
    public static final <K, V> h<K, V> X(@l h<? extends K, ? extends V> hVar, @l m<? extends q0<? extends K, ? extends V>> mVar) {
        return f0(hVar, mVar);
    }

    @l
    public static final <K, V> h<K, V> Y(@l h<? extends K, ? extends V> hVar, @l q0<? extends K, ? extends V>[] q0VarArr) {
        return g0(hVar, q0VarArr);
    }

    @l
    public static final <E> i<E> Z(@l i<? extends E> iVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return iVar.addAll((Collection<? extends Object>) iterable);
        }
        i.a<? extends E> g4 = iVar.g();
        w.q0(g4, iterable);
        return g4.a();
    }

    @l
    @k(message = "Use persistentHashMapOf instead.", replaceWith = @x0(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final <K, V> h<K, V> a(@l q0<? extends K, ? extends V>... q0VarArr) {
        return D((q0[]) Arrays.copyOf(q0VarArr, q0VarArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> i<E> a0(@l i<? extends E> iVar, E e4) {
        return iVar.add((i<? extends E>) e4);
    }

    @l
    @k(message = "Use persistentHashSetOf instead.", replaceWith = @x0(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final <E> i<E> b(@l E... eArr) {
        return F(Arrays.copyOf(eArr, eArr.length));
    }

    @l
    public static final <E> i<E> b0(@l i<? extends E> iVar, @l m<? extends E> mVar) {
        i.a<? extends E> g4 = iVar.g();
        w.r0(g4, mVar);
        return g4.a();
    }

    @l
    @k(message = "Use persistentListOf instead.", replaceWith = @x0(expression = "persistentListOf()", imports = {}))
    public static final <E> g<E> c() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b();
    }

    @l
    public static final <E> i<E> c0(@l i<? extends E> iVar, @l E[] eArr) {
        i.a<? extends E> g4 = iVar.g();
        w.s0(g4, eArr);
        return g4.a();
    }

    @l
    @k(message = "Use persistentListOf instead.", replaceWith = @x0(expression = "persistentListOf(*elements)", imports = {}))
    public static final <E> g<E> d(@l E... eArr) {
        return H(Arrays.copyOf(eArr, eArr.length));
    }

    @l
    public static final <K, V> h<K, V> d0(@l h<? extends K, ? extends V> hVar, @l Iterable<? extends q0<? extends K, ? extends V>> iterable) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        z0.w0(g4, iterable);
        return g4.a2();
    }

    @l
    @k(message = "Use persistentMapOf instead.", replaceWith = @x0(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final <K, V> h<K, V> e(@l q0<? extends K, ? extends V>... q0VarArr) {
        return J((q0[]) Arrays.copyOf(q0VarArr, q0VarArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <K, V> h<K, V> e0(@l h<? extends K, ? extends V> hVar, @l Map<? extends K, ? extends V> map) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return hVar.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @l
    @k(message = "Use persistentSetOf instead.", replaceWith = @x0(expression = "persistentSetOf()", imports = {}))
    public static final <E> i<E> f() {
        return K();
    }

    @l
    public static final <K, V> h<K, V> f0(@l h<? extends K, ? extends V> hVar, @l m<? extends q0<? extends K, ? extends V>> mVar) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        z0.x0(g4, mVar);
        return g4.a2();
    }

    @l
    @k(message = "Use persistentSetOf instead.", replaceWith = @x0(expression = "persistentSetOf(*elements)", imports = {}))
    public static final <E> i<E> g(@l E... eArr) {
        return L(Arrays.copyOf(eArr, eArr.length));
    }

    @l
    public static final <K, V> h<K, V> g0(@l h<? extends K, ? extends V> hVar, @l q0<? extends K, ? extends V>[] q0VarArr) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        z0.y0(g4, q0VarArr);
        return g4.a2();
    }

    @l
    public static final <E> i<E> h(@l f<? extends E> fVar, @l Iterable<? extends E> iterable) {
        return i(x0(fVar), iterable);
    }

    @l
    public static final c<Character> h0(@l CharSequence charSequence) {
        return s0(charSequence);
    }

    @l
    public static final <E> i<E> i(@l i<? extends E> iVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return iVar.retainAll((Collection<? extends Object>) iterable);
        }
        i.a<? extends E> g4 = iVar.g();
        w.R0(g4, iterable);
        return g4.a();
    }

    @l
    public static final <T> c<T> i0(@l Iterable<? extends T> iterable) {
        c<T> cVar = iterable instanceof c ? (c) iterable : null;
        return cVar == null ? t0(iterable) : cVar;
    }

    @l
    public static final <E> f<E> j(@l f<? extends E> fVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return fVar.removeAll((Collection<? extends Object>) iterable);
        }
        f.a<? extends E> g4 = fVar.g();
        w.H0(g4, iterable);
        return g4.a();
    }

    @l
    public static final <T> c<T> j0(@l m<? extends T> mVar) {
        return u0(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> f<E> k(@l f<? extends E> fVar, E e4) {
        return fVar.remove((f<? extends E>) e4);
    }

    @l
    public static final <K, V> d<K, V> k0(@l Map<K, ? extends V> map) {
        d<K, V> dVar = map instanceof d ? (d) map : null;
        if (dVar != null) {
            return dVar;
        }
        h.a aVar = map instanceof h.a ? (h.a) map : null;
        h<K, V> a22 = aVar != null ? aVar.a2() : null;
        return a22 != null ? a22 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.INSTANCE.a().putAll((Map) map);
    }

    @l
    public static final <E> f<E> l(@l f<? extends E> fVar, @l m<? extends E> mVar) {
        f.a<? extends E> g4 = fVar.g();
        w.J0(g4, mVar);
        return g4.a();
    }

    @l
    public static final <T> e<T> l0(@l Iterable<? extends T> iterable) {
        e<T> eVar = iterable instanceof e ? (e) iterable : null;
        if (eVar != null) {
            return eVar;
        }
        i.a aVar = iterable instanceof i.a ? (i.a) iterable : null;
        i a5 = aVar != null ? aVar.a() : null;
        return a5 != null ? a5 : Z(K(), iterable);
    }

    @l
    public static final <E> f<E> m(@l f<? extends E> fVar, @l E[] eArr) {
        f.a<? extends E> g4 = fVar.g();
        w.K0(g4, eArr);
        return g4.a();
    }

    @l
    public static final <T> e<T> m0(@l m<? extends T> mVar) {
        return y0(mVar);
    }

    @l
    public static final <E> g<E> n(@l g<? extends E> gVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return gVar.removeAll((Collection<? extends Object>) iterable);
        }
        g.a<? extends E> g4 = gVar.g();
        w.H0(g4, iterable);
        return g4.a();
    }

    @l
    public static final i<Character> n0(@l CharSequence charSequence) {
        return w0(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> g<E> o(@l g<? extends E> gVar, E e4) {
        return gVar.remove((g<? extends E>) e4);
    }

    @l
    public static final <K, V> h<K, V> o0(@l Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d) map : null;
        if (dVar != null) {
            return dVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f fVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f) map : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> a22 = fVar != null ? fVar.a2() : null;
        return a22 != null ? a22 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a().putAll((Map) map);
    }

    @l
    public static final <E> g<E> p(@l g<? extends E> gVar, @l m<? extends E> mVar) {
        g.a<? extends E> g4 = gVar.g();
        w.J0(g4, mVar);
        return g4.a();
    }

    @l
    public static final i<Character> p0(@l CharSequence charSequence) {
        i.a g4 = E().g();
        v.c9(charSequence, g4);
        return g4.a();
    }

    @l
    public static final <E> g<E> q(@l g<? extends E> gVar, @l E[] eArr) {
        g.a<? extends E> g4 = gVar.g();
        w.K0(g4, eArr);
        return g4.a();
    }

    @l
    public static final <T> i<T> q0(@l Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a aVar = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a) iterable : null;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b bVar = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a a5 = bVar != null ? bVar.a() : null;
        if (a5 != null) {
            return a5;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.INSTANCE.getClass();
        return Z(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a.f16297g, iterable);
    }

    @l
    public static final <K, V> h<K, V> r(@l h<? extends K, ? extends V> hVar, @l Iterable<? extends K> iterable) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        w.H0(g4.keySet(), iterable);
        return g4.a2();
    }

    @l
    public static final <T> i<T> r0(@l m<? extends T> mVar) {
        return b0(E(), mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <K, V> h<K, V> s(@l h<? extends K, ? extends V> hVar, K k4) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return hVar.remove((h<? extends K, ? extends V>) k4);
    }

    @l
    public static final g<Character> s0(@l CharSequence charSequence) {
        g.a g4 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b().g();
        v.c9(charSequence, g4);
        return g4.a();
    }

    @l
    public static final <K, V> h<K, V> t(@l h<? extends K, ? extends V> hVar, @l m<? extends K> mVar) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        w.J0(g4.keySet(), mVar);
        return g4.a2();
    }

    @l
    public static final <T> g<T> t0(@l Iterable<? extends T> iterable) {
        g<T> gVar = iterable instanceof g ? (g) iterable : null;
        if (gVar != null) {
            return gVar;
        }
        g.a aVar = iterable instanceof g.a ? (g.a) iterable : null;
        g<T> a5 = aVar != null ? aVar.a() : null;
        return a5 == null ? Q(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b(), iterable) : a5;
    }

    @l
    public static final <K, V> h<K, V> u(@l h<? extends K, ? extends V> hVar, @l K[] kArr) {
        l0.n(hVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<? extends K, ? extends V> g4 = hVar.g();
        w.K0(g4.keySet(), kArr);
        return g4.a2();
    }

    @l
    public static final <T> g<T> u0(@l m<? extends T> mVar) {
        return S(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.b(), mVar);
    }

    @l
    public static final <E> i<E> v(@l i<? extends E> iVar, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return iVar.removeAll((Collection<? extends Object>) iterable);
        }
        i.a<? extends E> g4 = iVar.g();
        w.H0(g4, iterable);
        return g4.a();
    }

    @l
    public static final <K, V> h<K, V> v0(@l Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c cVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c) map : null;
        if (cVar != null) {
            return cVar;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d dVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d) map : null;
        h<K, V> a22 = dVar != null ? dVar.a2() : null;
        return a22 == null ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c.INSTANCE.a().putAll((Map) map) : a22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> i<E> w(@l i<? extends E> iVar, E e4) {
        return iVar.remove((i<? extends E>) e4);
    }

    @l
    public static final i<Character> w0(@l CharSequence charSequence) {
        i.a g4 = K().g();
        v.c9(charSequence, g4);
        return g4.a();
    }

    @l
    public static final <E> i<E> x(@l i<? extends E> iVar, @l m<? extends E> mVar) {
        i.a<? extends E> g4 = iVar.g();
        w.J0(g4, mVar);
        return g4.a();
    }

    @l
    public static final <T> i<T> x0(@l Iterable<? extends T> iterable) {
        e0.b bVar = iterable instanceof e0.b ? (e0.b) iterable : null;
        if (bVar != null) {
            return bVar;
        }
        e0.c cVar = iterable instanceof e0.c ? (e0.c) iterable : null;
        i<T> a5 = cVar != null ? cVar.a() : null;
        if (a5 != null) {
            return a5;
        }
        e0.b.INSTANCE.getClass();
        return Z(e0.b.f73741h, iterable);
    }

    @l
    public static final <E> i<E> y(@l i<? extends E> iVar, @l E[] eArr) {
        i.a<? extends E> g4 = iVar.g();
        w.K0(g4, eArr);
        return g4.a();
    }

    @l
    public static final <T> i<T> y0(@l m<? extends T> mVar) {
        return b0(K(), mVar);
    }

    @l
    public static final <T> g<T> z(@l g<? extends T> gVar, @l ld.l<? super List<T>, k2> lVar) {
        g.a<? extends T> g4 = gVar.g();
        lVar.invoke(g4);
        return g4.a();
    }
}
