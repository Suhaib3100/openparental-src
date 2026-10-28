package androidx.compose.ui.text;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;

/* compiled from: TextStyle.kt */
@m1
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bI\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001mB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB×\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b\b\u0010,Bï\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b\b\u0010/B\u0087\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b\b\u00104B\u009f\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u00109B\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010:B¡\u0002\b\u0016\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010?B©\u0002\b\u0017\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010@J\u000f\u0010A\u001a\u00020\u0002H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0004H\u0007¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u00020\u00002\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\bF\u0010GJ \u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ¨\u0002\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0002H\u0007¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0004H\u0007¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\bP\u0010GJ\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\bQ\u0010OJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\bR\u0010MJà\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010TJø\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u0090\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ¨\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u009e\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00108\u001a\u0004\u0018\u000107ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J²\u0002\u0010]\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\b]\u0010^J¨\u0002\u0010_\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00108\u001a\u0004\u0018\u000107ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u001a\u0010b\u001a\u00020a2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u00020a2\u0006\u0010E\u001a\u00020\u0000¢\u0006\u0004\bd\u0010eJ\u0015\u0010f\u001a\u00020a2\u0006\u0010E\u001a\u00020\u0000¢\u0006\u0004\bf\u0010eJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020gH\u0000¢\u0006\u0004\bj\u0010iJ\u000f\u0010k\u001a\u00020\u0017H\u0016¢\u0006\u0004\bk\u0010lR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010p\u001a\u0004\bq\u0010DR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\"\u0010z\u001a\u0004\u0018\u00010%8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bx\u0010y\u001a\u0004\bv\u0010wR\"\u0010~\u001a\u0004\u0018\u00010'8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b}\u0010y\u001a\u0004\b{\u0010|R%\u0010\u0082\u0001\u001a\u0004\u0018\u0001028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010y\u001a\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0086\u0001\u001a\u0004\u0018\u0001008GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u0012\u0005\b\u0085\u0001\u0010y\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010<\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0013\u0010>\u001a\u00020=8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010lR\u0019\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u008a\u0001R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u008a\u0001R\u0015\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0015\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u00106\u001a\u0004\u0018\u0001058F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010&\u001a\u00020%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010iR\u0018\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010iR\u0019\u0010)\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b§\u0001\u0010\u008a\u0001R\u0015\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0015\u0010.\u001a\u0004\u0018\u00010-8F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u00103\u001a\u0002028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010iR\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010iR\u0015\u00108\u001a\u0004\u0018\u0001078F¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0001"}, d2 = {"Landroidx/compose/ui/text/v0;", "", "Landroidx/compose/ui/text/i0;", "spanStyle", "Landroidx/compose/ui/text/y;", "paragraphStyle", "Landroidx/compose/ui/text/f0;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/f0;)V", "(Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/y;)V", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/unit/z;", "fontSize", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroidx/compose/ui/text/font/y;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/o;", "textGeometricTransform", "Lu0/f;", "localeList", "background", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/style/j;", "textAlign", "Landroidx/compose/ui/text/style/l;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/q;", "textIndent", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/text/style/h;", "lineHeightStyle", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/text/style/f;", "lineBreak", "Landroidx/compose/ui/text/style/e;", "hyphens", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "Landroidx/compose/ui/text/style/s;", "textMotion", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/s;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/s;Lkotlin/jvm/internal/w;)V", "o0", "()Landroidx/compose/ui/text/i0;", "n0", "()Landroidx/compose/ui/text/y;", "other", "e0", "(Landroidx/compose/ui/text/v0;)Landroidx/compose/ui/text/v0;", "i0", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/v0;", "g0", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/v0;", "d0", "(Landroidx/compose/ui/text/i0;)Landroidx/compose/ui/text/v0;", "c0", "(Landroidx/compose/ui/text/y;)Landroidx/compose/ui/text/v0;", "m0", "k0", "l0", "d", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;)Landroidx/compose/ui/text/v0;", "f", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;)Landroidx/compose/ui/text/v0;", "b", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;)Landroidx/compose/ui/text/v0;", "n", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/v0;", "l", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/v0;", "j", "(Landroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/v0;", "h", "(Landroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/graphics/drawscope/i;IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/f0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/v0;", "", "equals", "(Ljava/lang/Object;)Z", "a0", "(Landroidx/compose/ui/text/v0;)Z", "Z", "", "hashCode", "()I", "b0", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/i0;", "O", "Landroidx/compose/ui/text/y;", "L", "c", "Landroidx/compose/ui/text/f0;", "M", "()Landroidx/compose/ui/text/f0;", "P", "()Landroidx/compose/ui/text/style/j;", "Q", "()V", "deprecated_boxing_textAlign", "T", "()Landroidx/compose/ui/text/style/l;", "U", "deprecated_boxing_textDirection", "B", "()Landroidx/compose/ui/text/style/e;", "C", "deprecated_boxing_hyphens", "F", "()Landroidx/compose/ui/text/style/f;", "G", "deprecated_boxing_lineBreak", "s", "()Landroidx/compose/ui/graphics/t1;", "t", "()J", "p", "()F", "x", "A", "()Landroidx/compose/ui/text/font/o0;", "y", "()Landroidx/compose/ui/text/font/k0;", "z", "()Landroidx/compose/ui/text/font/l0;", "v", "()Landroidx/compose/ui/text/font/y;", "w", "E", "r", "()Landroidx/compose/ui/text/style/a;", "W", "()Landroidx/compose/ui/text/style/o;", "K", "()Lu0/f;", "q", "S", "()Landroidx/compose/ui/text/style/k;", "N", "()Landroidx/compose/ui/graphics/c6;", "u", "()Landroidx/compose/ui/graphics/drawscope/i;", "R", "V", "I", "X", "()Landroidx/compose/ui/text/style/q;", "J", "()Landroidx/compose/ui/text/style/h;", "D", "H", "Y", "()Landroidx/compose/ui/text/style/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f21424e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0 spanStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y paragraphStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final f0 platformStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final v0 f21425f = new v0(0, 0, (androidx.compose.ui.text.font.o0) null, (androidx.compose.ui.text.font.k0) null, (androidx.compose.ui.text.font.l0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.o) null, (u0.f) null, 0, (androidx.compose.ui.text.style.k) null, (c6) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0, (androidx.compose.ui.text.style.q) null, (f0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.s) null, 16777215, (kotlin.jvm.internal.w) null);

    /* compiled from: TextStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/v0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/v0;", "Default", "Landroidx/compose/ui/text/v0;", "a", "()Landroidx/compose/ui/text/v0;", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.v0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final v0 a() {
            return v0.f21425f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ v0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, long j10, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, iVar, i4, i5, j10, qVar, f0Var, hVar, i6, i7, sVar);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void C() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void G() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void Q() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void U() {
    }

    public static /* synthetic */ v0 f0(v0 v0Var, v0 v0Var2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            v0Var2 = null;
        }
        return v0Var.e0(v0Var2);
    }

    public static v0 h0(v0 v0Var, long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.q qVar, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, f0 f0Var, androidx.compose.ui.text.style.s sVar, int i4, Object obj) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        if ((i4 & 1) != 0) {
            d2.INSTANCE.getClass();
            j11 = d2.f17778o;
        } else {
            j11 = j4;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j12 = androidx.compose.ui.unit.z.f21534d;
        } else {
            j12 = j5;
        }
        androidx.compose.ui.text.font.o0 o0Var2 = (i4 & 4) != 0 ? null : o0Var;
        androidx.compose.ui.text.font.k0 k0Var2 = (i4 & 8) != 0 ? null : k0Var;
        androidx.compose.ui.text.font.l0 l0Var2 = (i4 & 16) != 0 ? null : l0Var;
        androidx.compose.ui.text.font.y yVar2 = (i4 & 32) != 0 ? null : yVar;
        String str2 = (i4 & 64) != 0 ? null : str;
        if ((i4 & 128) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j13 = androidx.compose.ui.unit.z.f21534d;
        } else {
            j13 = j6;
        }
        androidx.compose.ui.text.style.a aVar2 = (i4 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.o oVar2 = (i4 & 512) != 0 ? null : oVar;
        u0.f fVar3 = (i4 & 1024) != 0 ? null : fVar;
        if ((i4 & 2048) != 0) {
            d2.INSTANCE.getClass();
            j14 = d2.f17778o;
        } else {
            j14 = j7;
        }
        androidx.compose.ui.text.style.k kVar2 = (i4 & 4096) != 0 ? null : kVar;
        c6 c6Var2 = (i4 & 8192) != 0 ? null : c6Var;
        androidx.compose.ui.graphics.drawscope.i iVar2 = (i4 & 16384) != 0 ? null : iVar;
        androidx.compose.ui.text.style.j jVar2 = (i4 & 32768) != 0 ? null : jVar;
        androidx.compose.ui.text.style.l lVar2 = (i4 & 65536) != 0 ? null : lVar;
        if ((i4 & 131072) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j15 = androidx.compose.ui.unit.z.f21534d;
        } else {
            j15 = j10;
        }
        return v0Var.g0(j11, j12, o0Var2, k0Var2, l0Var2, yVar2, str2, j13, aVar2, oVar2, fVar3, j14, kVar2, c6Var2, iVar2, jVar2, lVar2, j15, (i4 & 262144) != 0 ? null : qVar, (i4 & 524288) != 0 ? null : hVar, (i4 & 1048576) != 0 ? null : fVar2, (i4 & 2097152) != 0 ? null : eVar, (i4 & 4194304) != 0 ? null : f0Var, (i4 & 8388608) != 0 ? null : sVar);
    }

    public static /* synthetic */ v0 i(v0 v0Var, t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, long j7, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar, int i10, Object obj) {
        c6 c6Var2;
        androidx.compose.ui.graphics.drawscope.i iVar2;
        androidx.compose.ui.graphics.drawscope.i iVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        androidx.compose.ui.text.style.q qVar2;
        f0 f0Var2;
        f0 f0Var3;
        androidx.compose.ui.text.style.h hVar2;
        androidx.compose.ui.text.style.h hVar3;
        int i15;
        int i16;
        int i17;
        float i18 = (i10 & 2) != 0 ? v0Var.spanStyle.i() : f4;
        long fontSize = (i10 & 4) != 0 ? v0Var.spanStyle.getFontSize() : j4;
        androidx.compose.ui.text.font.o0 fontWeight = (i10 & 8) != 0 ? v0Var.spanStyle.getFontWeight() : o0Var;
        androidx.compose.ui.text.font.k0 fontStyle = (i10 & 16) != 0 ? v0Var.spanStyle.getFontStyle() : k0Var;
        androidx.compose.ui.text.font.l0 fontSynthesis = (i10 & 32) != 0 ? v0Var.spanStyle.getFontSynthesis() : l0Var;
        androidx.compose.ui.text.font.y fontFamily = (i10 & 64) != 0 ? v0Var.spanStyle.getFontFamily() : yVar;
        String fontFeatureSettings = (i10 & 128) != 0 ? v0Var.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 256) != 0 ? v0Var.spanStyle.getLetterSpacing() : j5;
        androidx.compose.ui.text.style.a baselineShift = (i10 & 512) != 0 ? v0Var.spanStyle.getBaselineShift() : aVar;
        androidx.compose.ui.text.style.o textGeometricTransform = (i10 & 1024) != 0 ? v0Var.spanStyle.getTextGeometricTransform() : oVar;
        u0.f localeList = (i10 & 2048) != 0 ? v0Var.spanStyle.getLocaleList() : fVar;
        long background = (i10 & 4096) != 0 ? v0Var.spanStyle.getBackground() : j6;
        androidx.compose.ui.text.style.k background2 = (i10 & 8192) != 0 ? v0Var.spanStyle.getBackground() : kVar;
        c6 shadow = (i10 & 16384) != 0 ? v0Var.spanStyle.getShadow() : c6Var;
        if ((i10 & 32768) != 0) {
            c6Var2 = shadow;
            iVar2 = v0Var.spanStyle.getDrawStyle();
        } else {
            c6Var2 = shadow;
            iVar2 = iVar;
        }
        if ((i10 & 65536) != 0) {
            iVar3 = iVar2;
            i11 = v0Var.paragraphStyle.getTextAlign();
        } else {
            iVar3 = iVar2;
            i11 = i4;
        }
        if ((i10 & 131072) != 0) {
            i12 = i11;
            i13 = v0Var.paragraphStyle.getTextDirection();
        } else {
            i12 = i11;
            i13 = i5;
        }
        if ((i10 & 262144) != 0) {
            i14 = i13;
            j10 = v0Var.paragraphStyle.getLineHeight();
        } else {
            i14 = i13;
            j10 = j7;
        }
        androidx.compose.ui.text.style.q textIndent = (524288 & i10) != 0 ? v0Var.paragraphStyle.getTextIndent() : qVar;
        if ((i10 & 1048576) != 0) {
            qVar2 = textIndent;
            f0Var2 = v0Var.platformStyle;
        } else {
            qVar2 = textIndent;
            f0Var2 = f0Var;
        }
        if ((i10 & 2097152) != 0) {
            f0Var3 = f0Var2;
            hVar2 = v0Var.paragraphStyle.getLineHeightStyle();
        } else {
            f0Var3 = f0Var2;
            hVar2 = hVar;
        }
        if ((i10 & 4194304) != 0) {
            hVar3 = hVar2;
            i15 = v0Var.paragraphStyle.getLineBreak();
        } else {
            hVar3 = hVar2;
            i15 = i6;
        }
        if ((i10 & 8388608) != 0) {
            i16 = i15;
            i17 = v0Var.paragraphStyle.getHyphens();
        } else {
            i16 = i15;
            i17 = i7;
        }
        return v0Var.h(t1Var, i18, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, background2, c6Var2, iVar3, i12, i14, j10, qVar2, f0Var3, hVar3, i16, i17, (i10 & 16777216) != 0 ? v0Var.paragraphStyle.getTextMotion() : sVar);
    }

    public static v0 j0(v0 v0Var, long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, long j10, androidx.compose.ui.text.style.q qVar, androidx.compose.ui.text.style.h hVar, int i6, int i7, f0 f0Var, androidx.compose.ui.text.style.s sVar, int i10, Object obj) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11;
        int i12;
        long j15;
        int i13;
        int i14;
        if ((i10 & 1) != 0) {
            d2.INSTANCE.getClass();
            j11 = d2.f17778o;
        } else {
            j11 = j4;
        }
        if ((i10 & 2) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j12 = androidx.compose.ui.unit.z.f21534d;
        } else {
            j12 = j5;
        }
        androidx.compose.ui.text.font.o0 o0Var2 = (i10 & 4) != 0 ? null : o0Var;
        androidx.compose.ui.text.font.k0 k0Var2 = (i10 & 8) != 0 ? null : k0Var;
        androidx.compose.ui.text.font.l0 l0Var2 = (i10 & 16) != 0 ? null : l0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        if ((i10 & 128) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j13 = androidx.compose.ui.unit.z.f21534d;
        } else {
            j13 = j6;
        }
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.o oVar2 = (i10 & 512) != 0 ? null : oVar;
        u0.f fVar2 = (i10 & 1024) != 0 ? null : fVar;
        if ((i10 & 2048) != 0) {
            d2.INSTANCE.getClass();
            j14 = d2.f17778o;
        } else {
            j14 = j7;
        }
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        c6 c6Var2 = (i10 & 8192) != 0 ? null : c6Var;
        androidx.compose.ui.graphics.drawscope.i iVar2 = (i10 & 16384) != 0 ? null : iVar;
        if ((i10 & 32768) != 0) {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i11 = androidx.compose.ui.text.style.j.f21360i;
        } else {
            i11 = i4;
        }
        if ((i10 & 65536) != 0) {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i12 = androidx.compose.ui.text.style.l.f21374h;
        } else {
            i12 = i5;
        }
        if ((i10 & 131072) != 0) {
            androidx.compose.ui.unit.z.INSTANCE.getClass();
            j15 = androidx.compose.ui.unit.z.f21534d;
        } else {
            j15 = j10;
        }
        androidx.compose.ui.text.style.q qVar2 = (i10 & 262144) != 0 ? null : qVar;
        androidx.compose.ui.text.style.h hVar2 = (i10 & 524288) != 0 ? null : hVar;
        if ((i10 & 1048576) != 0) {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i13 = androidx.compose.ui.text.style.f.f21314f;
        } else {
            i13 = i6;
        }
        if ((i10 & 2097152) != 0) {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i14 = androidx.compose.ui.text.style.e.f21308e;
        } else {
            i14 = i7;
        }
        return v0Var.i0(j11, j12, o0Var2, k0Var2, l0Var2, yVar2, str2, j13, aVar2, oVar2, fVar2, j14, kVar2, c6Var2, iVar2, i11, i12, j15, qVar2, hVar2, i13, i14, (i10 & 4194304) != 0 ? null : f0Var, (i10 & 8388608) != 0 ? null : sVar);
    }

    public static /* synthetic */ v0 k(v0 v0Var, t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j7, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.s sVar, int i4, Object obj) {
        c6 c6Var2;
        androidx.compose.ui.graphics.drawscope.i iVar2;
        androidx.compose.ui.graphics.drawscope.i iVar3;
        androidx.compose.ui.text.style.j jVar2;
        androidx.compose.ui.text.style.j jVar3;
        androidx.compose.ui.text.style.l lVar2;
        androidx.compose.ui.text.style.l lVar3;
        long j10;
        androidx.compose.ui.text.style.q qVar2;
        f0 f0Var2;
        f0 f0Var3;
        androidx.compose.ui.text.style.h hVar2;
        androidx.compose.ui.text.style.h hVar3;
        androidx.compose.ui.text.style.f fVar3;
        androidx.compose.ui.text.style.f fVar4;
        androidx.compose.ui.text.style.e eVar2;
        float i5 = (i4 & 2) != 0 ? v0Var.spanStyle.i() : f4;
        long fontSize = (i4 & 4) != 0 ? v0Var.spanStyle.getFontSize() : j4;
        androidx.compose.ui.text.font.o0 fontWeight = (i4 & 8) != 0 ? v0Var.spanStyle.getFontWeight() : o0Var;
        androidx.compose.ui.text.font.k0 fontStyle = (i4 & 16) != 0 ? v0Var.spanStyle.getFontStyle() : k0Var;
        androidx.compose.ui.text.font.l0 fontSynthesis = (i4 & 32) != 0 ? v0Var.spanStyle.getFontSynthesis() : l0Var;
        androidx.compose.ui.text.font.y fontFamily = (i4 & 64) != 0 ? v0Var.spanStyle.getFontFamily() : yVar;
        String fontFeatureSettings = (i4 & 128) != 0 ? v0Var.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i4 & 256) != 0 ? v0Var.spanStyle.getLetterSpacing() : j5;
        androidx.compose.ui.text.style.a baselineShift = (i4 & 512) != 0 ? v0Var.spanStyle.getBaselineShift() : aVar;
        androidx.compose.ui.text.style.o textGeometricTransform = (i4 & 1024) != 0 ? v0Var.spanStyle.getTextGeometricTransform() : oVar;
        u0.f localeList = (i4 & 2048) != 0 ? v0Var.spanStyle.getLocaleList() : fVar;
        long background = (i4 & 4096) != 0 ? v0Var.spanStyle.getBackground() : j6;
        androidx.compose.ui.text.style.k background2 = (i4 & 8192) != 0 ? v0Var.spanStyle.getBackground() : kVar;
        c6 shadow = (i4 & 16384) != 0 ? v0Var.spanStyle.getShadow() : c6Var;
        if ((i4 & 32768) != 0) {
            c6Var2 = shadow;
            iVar2 = v0Var.spanStyle.getDrawStyle();
        } else {
            c6Var2 = shadow;
            iVar2 = iVar;
        }
        if ((i4 & 65536) != 0) {
            iVar3 = iVar2;
            jVar2 = androidx.compose.ui.text.style.j.h(v0Var.paragraphStyle.getTextAlign());
        } else {
            iVar3 = iVar2;
            jVar2 = jVar;
        }
        if ((i4 & 131072) != 0) {
            jVar3 = jVar2;
            lVar2 = androidx.compose.ui.text.style.l.g(v0Var.paragraphStyle.getTextDirection());
        } else {
            jVar3 = jVar2;
            lVar2 = lVar;
        }
        if ((i4 & 262144) != 0) {
            lVar3 = lVar2;
            j10 = v0Var.paragraphStyle.getLineHeight();
        } else {
            lVar3 = lVar2;
            j10 = j7;
        }
        androidx.compose.ui.text.style.q textIndent = (524288 & i4) != 0 ? v0Var.paragraphStyle.getTextIndent() : qVar;
        if ((i4 & 1048576) != 0) {
            qVar2 = textIndent;
            f0Var2 = v0Var.platformStyle;
        } else {
            qVar2 = textIndent;
            f0Var2 = f0Var;
        }
        if ((i4 & 2097152) != 0) {
            f0Var3 = f0Var2;
            hVar2 = v0Var.paragraphStyle.getLineHeightStyle();
        } else {
            f0Var3 = f0Var2;
            hVar2 = hVar;
        }
        if ((i4 & 4194304) != 0) {
            hVar3 = hVar2;
            fVar3 = androidx.compose.ui.text.style.f.e(v0Var.paragraphStyle.getLineBreak());
        } else {
            hVar3 = hVar2;
            fVar3 = fVar2;
        }
        if ((i4 & 8388608) != 0) {
            fVar4 = fVar3;
            eVar2 = androidx.compose.ui.text.style.e.d(v0Var.paragraphStyle.getHyphens());
        } else {
            fVar4 = fVar3;
            eVar2 = eVar;
        }
        return v0Var.j(t1Var, i5, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, background2, c6Var2, iVar3, jVar3, lVar3, j10, qVar2, f0Var3, hVar3, fVar4, eVar2, (i4 & 16777216) != 0 ? v0Var.paragraphStyle.getTextMotion() : sVar);
    }

    @fg.m
    public final androidx.compose.ui.text.font.o0 A() {
        return this.spanStyle.getFontWeight();
    }

    @fg.m
    @kd.i(name = "getHyphens-EaSxIns")
    public final androidx.compose.ui.text.style.e B() {
        return androidx.compose.ui.text.style.e.d(this.paragraphStyle.getHyphens());
    }

    public final int D() {
        return this.paragraphStyle.getHyphens();
    }

    public final long E() {
        return this.spanStyle.getLetterSpacing();
    }

    @fg.m
    @kd.i(name = "getLineBreak-LgCVezo")
    public final androidx.compose.ui.text.style.f F() {
        return androidx.compose.ui.text.style.f.e(this.paragraphStyle.getLineBreak());
    }

    public final int H() {
        return this.paragraphStyle.getLineBreak();
    }

    public final long I() {
        return this.paragraphStyle.getLineHeight();
    }

    @fg.m
    public final androidx.compose.ui.text.style.h J() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @fg.m
    public final u0.f K() {
        return this.spanStyle.getLocaleList();
    }

    @fg.l
    /* renamed from: L, reason: from getter */
    public final y getParagraphStyle() {
        return this.paragraphStyle;
    }

    @fg.m
    /* renamed from: M, reason: from getter */
    public final f0 getPlatformStyle() {
        return this.platformStyle;
    }

    @fg.m
    public final c6 N() {
        return this.spanStyle.getShadow();
    }

    @fg.l
    /* renamed from: O, reason: from getter */
    public final i0 getSpanStyle() {
        return this.spanStyle;
    }

    @fg.m
    @kd.i(name = "getTextAlign-buA522U")
    public final androidx.compose.ui.text.style.j P() {
        return androidx.compose.ui.text.style.j.h(this.paragraphStyle.getTextAlign());
    }

    public final int R() {
        return this.paragraphStyle.getTextAlign();
    }

    @fg.m
    public final androidx.compose.ui.text.style.k S() {
        return this.spanStyle.getBackground();
    }

    @fg.m
    @kd.i(name = "getTextDirection-mmuk1to")
    public final androidx.compose.ui.text.style.l T() {
        return androidx.compose.ui.text.style.l.g(this.paragraphStyle.getTextDirection());
    }

    public final int V() {
        return this.paragraphStyle.getTextDirection();
    }

    @fg.m
    public final androidx.compose.ui.text.style.o W() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @fg.m
    public final androidx.compose.ui.text.style.q X() {
        return this.paragraphStyle.getTextIndent();
    }

    @fg.m
    public final androidx.compose.ui.text.style.s Y() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean Z(@fg.l v0 other) {
        return this == other || this.spanStyle.C(other.spanStyle);
    }

    public final boolean a0(@fg.l v0 other) {
        return this == other || (kotlin.jvm.internal.l0.g(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.B(other.spanStyle));
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    public final v0 b(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, f0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle, androidx.compose.ui.text.style.f lineBreak, androidx.compose.ui.text.style.e hyphens) {
        int i4;
        int i5;
        int i6;
        int i7;
        i0 i0Var = new i0(d2.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (kotlin.jvm.internal.w) null);
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        c0 paragraphStyle = platformStyle != null ? platformStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            i6 = lineBreak.getMask();
        } else {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i6 = androidx.compose.ui.text.style.f.f21314f;
        }
        if (hyphens != null) {
            i7 = hyphens.getValue();
        } else {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.e.f21308e;
        }
        return new v0(i0Var, new y(i4, i5, lineHeight, textIndent, paragraphStyle, lineHeightStyle, i6, i7, this.paragraphStyle.getTextMotion(), (kotlin.jvm.internal.w) null), platformStyle);
    }

    public final int b0() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.D() * 31)) * 31;
        f0 f0Var = this.platformStyle;
        return hashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    @x4
    @fg.l
    public final v0 c0(@fg.l y other) {
        return new v0(this.spanStyle, this.paragraphStyle.B(other));
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final v0 d(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent) {
        int i4;
        int i5;
        i0 i0Var = new i0(d2.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (kotlin.jvm.internal.w) null);
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        return new v0(i0Var, new y(i4, i5, lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), this.paragraphStyle.getLineHeightStyle(), this.paragraphStyle.getLineBreak(), this.paragraphStyle.getHyphens(), this.paragraphStyle.getTextMotion(), (kotlin.jvm.internal.w) null), this.platformStyle);
    }

    @x4
    @fg.l
    public final v0 d0(@fg.l i0 other) {
        return new v0(this.spanStyle.E(other), this.paragraphStyle);
    }

    @x4
    @fg.l
    public final v0 e0(@fg.m v0 other) {
        return (other == null || kotlin.jvm.internal.l0.g(other, f21425f)) ? this : new v0(this.spanStyle.E(other.spanStyle), this.paragraphStyle.B(other.paragraphStyle));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) other;
        return kotlin.jvm.internal.l0.g(this.spanStyle, v0Var.spanStyle) && kotlin.jvm.internal.l0.g(this.paragraphStyle, v0Var.paragraphStyle) && kotlin.jvm.internal.l0.g(this.platformStyle, v0Var.platformStyle);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final v0 f(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, f0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle) {
        int i4;
        int i5;
        i0 i0Var = new i0(d2.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (kotlin.jvm.internal.w) null);
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        return new v0(i0Var, new y(i4, i5, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, this.paragraphStyle.getLineBreak(), this.paragraphStyle.getHyphens(), this.paragraphStyle.getTextMotion(), (kotlin.jvm.internal.w) null), platformStyle);
    }

    @x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final v0 g0(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, androidx.compose.ui.graphics.drawscope.i drawStyle, androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, androidx.compose.ui.text.style.h lineHeightStyle, androidx.compose.ui.text.style.f lineBreak, androidx.compose.ui.text.style.e hyphens, f0 platformStyle, androidx.compose.ui.text.style.s textMotion) {
        int i4;
        int i5;
        int i6;
        int i7;
        i0 b5 = j0.b(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        y yVar = this.paragraphStyle;
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        c0 paragraphStyle = platformStyle != null ? platformStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            i6 = lineBreak.getMask();
        } else {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i6 = androidx.compose.ui.text.style.f.f21314f;
        }
        if (hyphens != null) {
            i7 = hyphens.getValue();
        } else {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.e.f21308e;
        }
        y a5 = z.a(yVar, i4, i5, lineHeight, textIndent, paragraphStyle, lineHeightStyle, i6, i7, textMotion);
        return (this.spanStyle == b5 && this.paragraphStyle == a5) ? this : new v0(b5, a5);
    }

    @fg.l
    public final v0 h(@fg.m t1 brush, float alpha, long fontSize, @fg.m androidx.compose.ui.text.font.o0 fontWeight, @fg.m androidx.compose.ui.text.font.k0 fontStyle, @fg.m androidx.compose.ui.text.font.l0 fontSynthesis, @fg.m androidx.compose.ui.text.font.y fontFamily, @fg.m String fontFeatureSettings, long letterSpacing, @fg.m androidx.compose.ui.text.style.a baselineShift, @fg.m androidx.compose.ui.text.style.o textGeometricTransform, @fg.m u0.f localeList, long background, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m c6 shadow, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int textAlign, int textDirection, long lineHeight, @fg.m androidx.compose.ui.text.style.q textIndent, @fg.m f0 platformStyle, @fg.m androidx.compose.ui.text.style.h lineHeightStyle, int lineBreak, int hyphens, @fg.m androidx.compose.ui.text.style.s textMotion) {
        return new v0(new i0(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (kotlin.jvm.internal.w) null), new y(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (kotlin.jvm.internal.w) null), platformStyle);
    }

    public int hashCode() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCode() * 31)) * 31;
        f0 f0Var = this.platformStyle;
        return hashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    @x4
    @fg.l
    public final v0 i0(long color, long fontSize, @fg.m androidx.compose.ui.text.font.o0 fontWeight, @fg.m androidx.compose.ui.text.font.k0 fontStyle, @fg.m androidx.compose.ui.text.font.l0 fontSynthesis, @fg.m androidx.compose.ui.text.font.y fontFamily, @fg.m String fontFeatureSettings, long letterSpacing, @fg.m androidx.compose.ui.text.style.a baselineShift, @fg.m androidx.compose.ui.text.style.o textGeometricTransform, @fg.m u0.f localeList, long background, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m c6 shadow, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int textAlign, int textDirection, long lineHeight, @fg.m androidx.compose.ui.text.style.q textIndent, @fg.m androidx.compose.ui.text.style.h lineHeightStyle, int lineBreak, int hyphens, @fg.m f0 platformStyle, @fg.m androidx.compose.ui.text.style.s textMotion) {
        i0 b5 = j0.b(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        y a5 = z.a(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == b5 && this.paragraphStyle == a5) ? this : new v0(b5, a5);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final v0 j(t1 brush, float alpha, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, androidx.compose.ui.graphics.drawscope.i drawStyle, androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, f0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle, androidx.compose.ui.text.style.f lineBreak, androidx.compose.ui.text.style.e hyphens, androidx.compose.ui.text.style.s textMotion) {
        int i4;
        int i5;
        int i6;
        int i7;
        i0 i0Var = new i0(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (kotlin.jvm.internal.w) null);
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        c0 paragraphStyle = platformStyle != null ? platformStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            i6 = lineBreak.getMask();
        } else {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i6 = androidx.compose.ui.text.style.f.f21314f;
        }
        if (hyphens != null) {
            i7 = hyphens.getValue();
        } else {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.e.f21308e;
        }
        return new v0(i0Var, new y(i4, i5, lineHeight, textIndent, paragraphStyle, lineHeightStyle, i6, i7, textMotion, (kotlin.jvm.internal.w) null), platformStyle);
    }

    @x4
    @fg.l
    public final v0 k0(@fg.l y other) {
        return c0(other);
    }

    @fg.l
    public final v0 l(long color, long fontSize, @fg.m androidx.compose.ui.text.font.o0 fontWeight, @fg.m androidx.compose.ui.text.font.k0 fontStyle, @fg.m androidx.compose.ui.text.font.l0 fontSynthesis, @fg.m androidx.compose.ui.text.font.y fontFamily, @fg.m String fontFeatureSettings, long letterSpacing, @fg.m androidx.compose.ui.text.style.a baselineShift, @fg.m androidx.compose.ui.text.style.o textGeometricTransform, @fg.m u0.f localeList, long background, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m c6 shadow, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int textAlign, int textDirection, long lineHeight, @fg.m androidx.compose.ui.text.style.q textIndent, @fg.m f0 platformStyle, @fg.m androidx.compose.ui.text.style.h lineHeightStyle, int lineBreak, int hyphens, @fg.m androidx.compose.ui.text.style.s textMotion) {
        return new v0(new i0(d2.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (kotlin.jvm.internal.w) null), new y(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (kotlin.jvm.internal.w) null), platformStyle);
    }

    @x4
    @fg.l
    public final v0 l0(@fg.l i0 other) {
        return d0(other);
    }

    @x4
    @fg.l
    public final v0 m0(@fg.l v0 other) {
        return e0(other);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final v0 n(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, androidx.compose.ui.graphics.drawscope.i drawStyle, androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, f0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle, androidx.compose.ui.text.style.f lineBreak, androidx.compose.ui.text.style.e hyphens, androidx.compose.ui.text.style.s textMotion) {
        int i4;
        int i5;
        int i6;
        int i7;
        i0 i0Var = new i0(d2.y(color, this.spanStyle.m()) ? this.spanStyle.getTextForegroundStyle() : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (kotlin.jvm.internal.w) null);
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        c0 paragraphStyle = platformStyle != null ? platformStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            i6 = lineBreak.getMask();
        } else {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i6 = androidx.compose.ui.text.style.f.f21314f;
        }
        if (hyphens != null) {
            i7 = hyphens.getValue();
        } else {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.e.f21308e;
        }
        return new v0(i0Var, new y(i4, i5, lineHeight, textIndent, paragraphStyle, lineHeightStyle, i6, i7, textMotion, (kotlin.jvm.internal.w) null), platformStyle);
    }

    @x4
    @fg.l
    public final y n0() {
        return this.paragraphStyle;
    }

    @x4
    @fg.l
    public final i0 o0() {
        return this.spanStyle;
    }

    public final float p() {
        return this.spanStyle.i();
    }

    public final long q() {
        return this.spanStyle.getBackground();
    }

    @fg.m
    public final androidx.compose.ui.text.style.a r() {
        return this.spanStyle.getBaselineShift();
    }

    @fg.m
    public final t1 s() {
        return this.spanStyle.l();
    }

    public final long t() {
        return this.spanStyle.m();
    }

    @fg.l
    public String toString() {
        return "TextStyle(color=" + ((Object) d2.L(this.spanStyle.m())) + ", brush=" + this.spanStyle.l() + ", alpha=" + this.spanStyle.i() + ", fontSize=" + ((Object) androidx.compose.ui.unit.z.u(this.spanStyle.getFontSize())) + ", fontWeight=" + this.spanStyle.getFontWeight() + ", fontStyle=" + this.spanStyle.getFontStyle() + ", fontSynthesis=" + this.spanStyle.getFontSynthesis() + ", fontFamily=" + this.spanStyle.getFontFamily() + ", fontFeatureSettings=" + this.spanStyle.getFontFeatureSettings() + ", letterSpacing=" + ((Object) androidx.compose.ui.unit.z.u(this.spanStyle.getLetterSpacing())) + ", baselineShift=" + this.spanStyle.getBaselineShift() + ", textGeometricTransform=" + this.spanStyle.getTextGeometricTransform() + ", localeList=" + this.spanStyle.getLocaleList() + ", background=" + ((Object) d2.L(this.spanStyle.getBackground())) + ", textDecoration=" + this.spanStyle.getBackground() + ", shadow=" + this.spanStyle.getShadow() + ", drawStyle=" + this.spanStyle.getDrawStyle() + ", textAlign=" + ((Object) androidx.compose.ui.text.style.j.m(this.paragraphStyle.getTextAlign())) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.l.l(this.paragraphStyle.getTextDirection())) + ", lineHeight=" + ((Object) androidx.compose.ui.unit.z.u(this.paragraphStyle.getLineHeight())) + ", textIndent=" + this.paragraphStyle.getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.paragraphStyle.getLineHeightStyle() + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.f.p(this.paragraphStyle.getLineBreak())) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.e.i(this.paragraphStyle.getHyphens())) + ", textMotion=" + this.paragraphStyle.getTextMotion() + ')';
    }

    @fg.m
    public final androidx.compose.ui.graphics.drawscope.i u() {
        return this.spanStyle.getDrawStyle();
    }

    @fg.m
    public final androidx.compose.ui.text.font.y v() {
        return this.spanStyle.getFontFamily();
    }

    @fg.m
    public final String w() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public final long x() {
        return this.spanStyle.getFontSize();
    }

    @fg.m
    public final androidx.compose.ui.text.font.k0 y() {
        return this.spanStyle.getFontStyle();
    }

    @fg.m
    public final androidx.compose.ui.text.font.l0 z() {
        return this.spanStyle.getFontSynthesis();
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ v0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.s sVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, iVar, jVar, lVar, j10, qVar, f0Var, hVar, fVar2, eVar, sVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ v0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, jVar, lVar, j10, qVar, f0Var, hVar, fVar2, eVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ v0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, jVar, lVar, j10, qVar, f0Var, hVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ v0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.q qVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, jVar, lVar, j10, qVar);
    }

    public /* synthetic */ v0(t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, long j7, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar, kotlin.jvm.internal.w wVar) {
        this(t1Var, f4, j4, o0Var, k0Var, l0Var, yVar, str, j5, aVar, oVar, fVar, j6, kVar, c6Var, iVar, i4, i5, j7, qVar, f0Var, hVar, i6, i7, sVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ v0(t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j7, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.s sVar, kotlin.jvm.internal.w wVar) {
        this(t1Var, f4, j4, o0Var, k0Var, l0Var, yVar, str, j5, aVar, oVar, fVar, j6, kVar, c6Var, iVar, jVar, lVar, j7, qVar, f0Var, hVar, fVar2, eVar, sVar);
    }

    public v0(@fg.l i0 i0Var, @fg.l y yVar, @fg.m f0 f0Var) {
        this.spanStyle = i0Var;
        this.paragraphStyle = yVar;
        this.platformStyle = f0Var;
    }

    public /* synthetic */ v0(i0 i0Var, y yVar, f0 f0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(i0Var, yVar, (i4 & 4) != 0 ? null : f0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(@fg.l androidx.compose.ui.text.i0 r3, @fg.l androidx.compose.ui.text.y r4) {
        /*
            r2 = this;
            androidx.compose.ui.text.d0 r0 = r3.getPlatformStyle()
            androidx.compose.ui.text.c0 r1 = r4.getPlatformStyle()
            androidx.compose.ui.text.f0 r0 = androidx.compose.ui.text.w0.a(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(androidx.compose.ui.text.i0, androidx.compose.ui.text.y):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(long r24, long r26, androidx.compose.ui.text.font.o0 r28, androidx.compose.ui.text.font.k0 r29, androidx.compose.ui.text.font.l0 r30, androidx.compose.ui.text.font.y r31, java.lang.String r32, long r33, androidx.compose.ui.text.style.a r35, androidx.compose.ui.text.style.o r36, u0.f r37, long r38, androidx.compose.ui.text.style.k r40, androidx.compose.ui.graphics.c6 r41, androidx.compose.ui.text.style.j r42, androidx.compose.ui.text.style.l r43, long r44, androidx.compose.ui.text.style.q r46, int r47, kotlin.jvm.internal.w r48) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private v0(long r23, long r25, androidx.compose.ui.text.font.o0 r27, androidx.compose.ui.text.font.k0 r28, androidx.compose.ui.text.font.l0 r29, androidx.compose.ui.text.font.y r30, java.lang.String r31, long r32, androidx.compose.ui.text.style.a r34, androidx.compose.ui.text.style.o r35, u0.f r36, long r37, androidx.compose.ui.text.style.k r39, androidx.compose.ui.graphics.c6 r40, androidx.compose.ui.text.style.j r41, androidx.compose.ui.text.style.l r42, long r43, androidx.compose.ui.text.style.q r45) {
        /*
            r22 = this;
            r1 = r23
            r3 = r25
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r39
            r18 = r40
            androidx.compose.ui.text.i0 r0 = new androidx.compose.ui.text.i0
            r23 = r0
            r20 = 0
            r21 = 0
            r19 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            androidx.compose.ui.text.y r0 = new androidx.compose.ui.text.y
            if (r41 == 0) goto L32
            int r1 = r41.getValue()
            goto L3b
        L32:
            androidx.compose.ui.text.style.j$a r1 = androidx.compose.ui.text.style.j.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.j.g()
        L3b:
            if (r42 == 0) goto L42
            int r2 = r42.getValue()
            goto L4b
        L42:
            androidx.compose.ui.text.style.l$a r2 = androidx.compose.ui.text.style.l.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.l.f()
        L4b:
            androidx.compose.ui.text.style.f$a r3 = androidx.compose.ui.text.style.f.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.f.d()
            androidx.compose.ui.text.style.e$a r4 = androidx.compose.ui.text.style.e.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.text.style.e.c()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r24 = r0
            r25 = r1
            r26 = r2
            r27 = r43
            r29 = r45
            r30 = r7
            r31 = r8
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35)
            r1 = 0
            r2 = r22
            r3 = r23
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(long r26, long r28, androidx.compose.ui.text.font.o0 r30, androidx.compose.ui.text.font.k0 r31, androidx.compose.ui.text.font.l0 r32, androidx.compose.ui.text.font.y r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.a r37, androidx.compose.ui.text.style.o r38, u0.f r39, long r40, androidx.compose.ui.text.style.k r42, androidx.compose.ui.graphics.c6 r43, androidx.compose.ui.text.style.j r44, androidx.compose.ui.text.style.l r45, long r46, androidx.compose.ui.text.style.q r48, androidx.compose.ui.text.f0 r49, androidx.compose.ui.text.style.h r50, int r51, kotlin.jvm.internal.w r52) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private v0(long r26, long r28, androidx.compose.ui.text.font.o0 r30, androidx.compose.ui.text.font.k0 r31, androidx.compose.ui.text.font.l0 r32, androidx.compose.ui.text.font.y r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.a r37, androidx.compose.ui.text.style.o r38, u0.f r39, long r40, androidx.compose.ui.text.style.k r42, androidx.compose.ui.graphics.c6 r43, androidx.compose.ui.text.style.j r44, androidx.compose.ui.text.style.l r45, long r46, androidx.compose.ui.text.style.q r48, androidx.compose.ui.text.f0 r49, androidx.compose.ui.text.style.h r50) {
        /*
            r25 = this;
            r0 = r49
            androidx.compose.ui.text.i0 r15 = new androidx.compose.ui.text.i0
            r23 = 0
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.d0 r1 = r49.getSpanStyle()
            r20 = r1
            goto L11
        Lf:
            r20 = r23
        L11:
            r21 = 0
            r22 = 0
            r1 = r15
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            androidx.compose.ui.text.y r1 = new androidx.compose.ui.text.y
            if (r44 == 0) goto L40
            int r2 = r44.getValue()
            goto L49
        L40:
            androidx.compose.ui.text.style.j$a r2 = androidx.compose.ui.text.style.j.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.j.g()
        L49:
            if (r45 == 0) goto L50
            int r3 = r45.getValue()
            goto L59
        L50:
            androidx.compose.ui.text.style.l$a r3 = androidx.compose.ui.text.style.l.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.l.f()
        L59:
            if (r0 == 0) goto L5f
            androidx.compose.ui.text.c0 r23 = r49.getParagraphStyle()
        L5f:
            androidx.compose.ui.text.style.f$a r4 = androidx.compose.ui.text.style.f.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.text.style.f.d()
            androidx.compose.ui.text.style.e$a r5 = androidx.compose.ui.text.style.e.INSTANCE
            r5.getClass()
            int r5 = androidx.compose.ui.text.style.e.c()
            r6 = 0
            r7 = 0
            r26 = r1
            r27 = r2
            r28 = r3
            r29 = r46
            r31 = r48
            r32 = r23
            r33 = r50
            r34 = r4
            r35 = r5
            r36 = r6
            r37 = r7
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(long r28, long r30, androidx.compose.ui.text.font.o0 r32, androidx.compose.ui.text.font.k0 r33, androidx.compose.ui.text.font.l0 r34, androidx.compose.ui.text.font.y r35, java.lang.String r36, long r37, androidx.compose.ui.text.style.a r39, androidx.compose.ui.text.style.o r40, u0.f r41, long r42, androidx.compose.ui.text.style.k r44, androidx.compose.ui.graphics.c6 r45, androidx.compose.ui.text.style.j r46, androidx.compose.ui.text.style.l r47, long r48, androidx.compose.ui.text.style.q r50, androidx.compose.ui.text.f0 r51, androidx.compose.ui.text.style.h r52, androidx.compose.ui.text.style.f r53, androidx.compose.ui.text.style.e r54, int r55, kotlin.jvm.internal.w r56) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private v0(long r27, long r29, androidx.compose.ui.text.font.o0 r31, androidx.compose.ui.text.font.k0 r32, androidx.compose.ui.text.font.l0 r33, androidx.compose.ui.text.font.y r34, java.lang.String r35, long r36, androidx.compose.ui.text.style.a r38, androidx.compose.ui.text.style.o r39, u0.f r40, long r41, androidx.compose.ui.text.style.k r43, androidx.compose.ui.graphics.c6 r44, androidx.compose.ui.text.style.j r45, androidx.compose.ui.text.style.l r46, long r47, androidx.compose.ui.text.style.q r49, androidx.compose.ui.text.f0 r50, androidx.compose.ui.text.style.h r51, androidx.compose.ui.text.style.f r52, androidx.compose.ui.text.style.e r53) {
        /*
            r26 = this;
            r0 = r50
            androidx.compose.ui.text.i0 r15 = new androidx.compose.ui.text.i0
            r24 = 0
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.d0 r1 = r50.getSpanStyle()
            r20 = r1
            goto L11
        Lf:
            r20 = r24
        L11:
            r22 = 32768(0x8000, float:4.5918E-41)
            r23 = 0
            r21 = 0
            r1 = r15
            r2 = r27
            r4 = r29
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r13 = r38
            r14 = r39
            r25 = r15
            r15 = r40
            r16 = r41
            r18 = r43
            r19 = r44
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.text.y r1 = new androidx.compose.ui.text.y
            if (r45 == 0) goto L43
            int r2 = r45.getValue()
            goto L4c
        L43:
            androidx.compose.ui.text.style.j$a r2 = androidx.compose.ui.text.style.j.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.j.g()
        L4c:
            if (r46 == 0) goto L53
            int r3 = r46.getValue()
            goto L5c
        L53:
            androidx.compose.ui.text.style.l$a r3 = androidx.compose.ui.text.style.l.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.l.f()
        L5c:
            if (r0 == 0) goto L62
            androidx.compose.ui.text.c0 r24 = r50.getParagraphStyle()
        L62:
            if (r52 == 0) goto L69
            int r4 = r52.getMask()
            goto L72
        L69:
            androidx.compose.ui.text.style.f$a r4 = androidx.compose.ui.text.style.f.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.text.style.f.d()
        L72:
            if (r53 == 0) goto L79
            int r5 = r53.getValue()
            goto L82
        L79:
            androidx.compose.ui.text.style.e$a r5 = androidx.compose.ui.text.style.e.INSTANCE
            r5.getClass()
            int r5 = androidx.compose.ui.text.style.e.c()
        L82:
            r6 = 256(0x100, float:3.59E-43)
            r7 = 0
            r8 = 0
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r47
            r32 = r49
            r33 = r24
            r34 = r51
            r35 = r4
            r36 = r5
            r37 = r8
            r38 = r6
            r39 = r7
            r27.<init>(r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39)
            r2 = r26
            r3 = r25
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(long r30, long r32, androidx.compose.ui.text.font.o0 r34, androidx.compose.ui.text.font.k0 r35, androidx.compose.ui.text.font.l0 r36, androidx.compose.ui.text.font.y r37, java.lang.String r38, long r39, androidx.compose.ui.text.style.a r41, androidx.compose.ui.text.style.o r42, u0.f r43, long r44, androidx.compose.ui.text.style.k r46, androidx.compose.ui.graphics.c6 r47, androidx.compose.ui.graphics.drawscope.i r48, androidx.compose.ui.text.style.j r49, androidx.compose.ui.text.style.l r50, long r51, androidx.compose.ui.text.style.q r53, androidx.compose.ui.text.f0 r54, androidx.compose.ui.text.style.h r55, androidx.compose.ui.text.style.f r56, androidx.compose.ui.text.style.e r57, androidx.compose.ui.text.style.s r58, int r59, kotlin.jvm.internal.w r60) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.graphics.drawscope.i, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.s, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private v0(long r26, long r28, androidx.compose.ui.text.font.o0 r30, androidx.compose.ui.text.font.k0 r31, androidx.compose.ui.text.font.l0 r32, androidx.compose.ui.text.font.y r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.a r37, androidx.compose.ui.text.style.o r38, u0.f r39, long r40, androidx.compose.ui.text.style.k r42, androidx.compose.ui.graphics.c6 r43, androidx.compose.ui.graphics.drawscope.i r44, androidx.compose.ui.text.style.j r45, androidx.compose.ui.text.style.l r46, long r47, androidx.compose.ui.text.style.q r49, androidx.compose.ui.text.f0 r50, androidx.compose.ui.text.style.h r51, androidx.compose.ui.text.style.f r52, androidx.compose.ui.text.style.e r53, androidx.compose.ui.text.style.s r54) {
        /*
            r25 = this;
            r0 = r50
            androidx.compose.ui.text.i0 r15 = new androidx.compose.ui.text.i0
            r23 = 0
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.d0 r1 = r50.getSpanStyle()
            r20 = r1
            goto L11
        Lf:
            r20 = r23
        L11:
            r22 = 0
            r1 = r15
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r21 = r44
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            androidx.compose.ui.text.y r1 = new androidx.compose.ui.text.y
            if (r45 == 0) goto L40
            int r2 = r45.getValue()
            goto L49
        L40:
            androidx.compose.ui.text.style.j$a r2 = androidx.compose.ui.text.style.j.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.j.g()
        L49:
            if (r46 == 0) goto L50
            int r3 = r46.getValue()
            goto L59
        L50:
            androidx.compose.ui.text.style.l$a r3 = androidx.compose.ui.text.style.l.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.l.f()
        L59:
            if (r0 == 0) goto L5f
            androidx.compose.ui.text.c0 r23 = r50.getParagraphStyle()
        L5f:
            if (r52 == 0) goto L66
            int r4 = r52.getMask()
            goto L6f
        L66:
            androidx.compose.ui.text.style.f$a r4 = androidx.compose.ui.text.style.f.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.text.style.f.d()
        L6f:
            if (r53 == 0) goto L76
            int r5 = r53.getValue()
            goto L7f
        L76:
            androidx.compose.ui.text.style.e$a r5 = androidx.compose.ui.text.style.e.INSTANCE
            r5.getClass()
            int r5 = androidx.compose.ui.text.style.e.c()
        L7f:
            r6 = 0
            r26 = r1
            r27 = r2
            r28 = r3
            r29 = r47
            r31 = r49
            r32 = r23
            r33 = r51
            r34 = r4
            r35 = r5
            r36 = r54
            r37 = r6
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.graphics.drawscope.i, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.s):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(long r30, long r32, androidx.compose.ui.text.font.o0 r34, androidx.compose.ui.text.font.k0 r35, androidx.compose.ui.text.font.l0 r36, androidx.compose.ui.text.font.y r37, java.lang.String r38, long r39, androidx.compose.ui.text.style.a r41, androidx.compose.ui.text.style.o r42, u0.f r43, long r44, androidx.compose.ui.text.style.k r46, androidx.compose.ui.graphics.c6 r47, androidx.compose.ui.graphics.drawscope.i r48, int r49, int r50, long r51, androidx.compose.ui.text.style.q r53, androidx.compose.ui.text.f0 r54, androidx.compose.ui.text.style.h r55, int r56, int r57, androidx.compose.ui.text.style.s r58, int r59, kotlin.jvm.internal.w r60) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.graphics.drawscope.i, int, int, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, int, int, androidx.compose.ui.text.style.s, int, kotlin.jvm.internal.w):void");
    }

    private v0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, long j10, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar) {
        this(new i0(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, f0Var != null ? f0Var.getSpanStyle() : null, iVar, (kotlin.jvm.internal.w) null), new y(i4, i5, j10, qVar, f0Var != null ? f0Var.getParagraphStyle() : null, hVar, i6, i7, sVar, (kotlin.jvm.internal.w) null), f0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(androidx.compose.ui.graphics.t1 r29, float r30, long r31, androidx.compose.ui.text.font.o0 r33, androidx.compose.ui.text.font.k0 r34, androidx.compose.ui.text.font.l0 r35, androidx.compose.ui.text.font.y r36, java.lang.String r37, long r38, androidx.compose.ui.text.style.a r40, androidx.compose.ui.text.style.o r41, u0.f r42, long r43, androidx.compose.ui.text.style.k r45, androidx.compose.ui.graphics.c6 r46, androidx.compose.ui.graphics.drawscope.i r47, int r48, int r49, long r50, androidx.compose.ui.text.style.q r52, androidx.compose.ui.text.f0 r53, androidx.compose.ui.text.style.h r54, int r55, int r56, androidx.compose.ui.text.style.s r57, int r58, kotlin.jvm.internal.w r59) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(androidx.compose.ui.graphics.t1, float, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.graphics.drawscope.i, int, int, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, int, int, androidx.compose.ui.text.style.s, int, kotlin.jvm.internal.w):void");
    }

    private v0(t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, long j7, androidx.compose.ui.text.style.q qVar, f0 f0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar) {
        this(new i0(t1Var, f4, j4, o0Var, k0Var, l0Var, yVar, str, j5, aVar, oVar, fVar, j6, kVar, c6Var, f0Var != null ? f0Var.getSpanStyle() : null, iVar, (kotlin.jvm.internal.w) null), new y(i4, i5, j7, qVar, f0Var != null ? f0Var.getParagraphStyle() : null, hVar, i6, i7, sVar, (kotlin.jvm.internal.w) null), f0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(androidx.compose.ui.graphics.t1 r29, float r30, long r31, androidx.compose.ui.text.font.o0 r33, androidx.compose.ui.text.font.k0 r34, androidx.compose.ui.text.font.l0 r35, androidx.compose.ui.text.font.y r36, java.lang.String r37, long r38, androidx.compose.ui.text.style.a r40, androidx.compose.ui.text.style.o r41, u0.f r42, long r43, androidx.compose.ui.text.style.k r45, androidx.compose.ui.graphics.c6 r46, androidx.compose.ui.graphics.drawscope.i r47, androidx.compose.ui.text.style.j r48, androidx.compose.ui.text.style.l r49, long r50, androidx.compose.ui.text.style.q r52, androidx.compose.ui.text.f0 r53, androidx.compose.ui.text.style.h r54, androidx.compose.ui.text.style.f r55, androidx.compose.ui.text.style.e r56, androidx.compose.ui.text.style.s r57, int r58, kotlin.jvm.internal.w r59) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(androidx.compose.ui.graphics.t1, float, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.graphics.drawscope.i, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.s, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private v0(androidx.compose.ui.graphics.t1 r26, float r27, long r28, androidx.compose.ui.text.font.o0 r30, androidx.compose.ui.text.font.k0 r31, androidx.compose.ui.text.font.l0 r32, androidx.compose.ui.text.font.y r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.a r37, androidx.compose.ui.text.style.o r38, u0.f r39, long r40, androidx.compose.ui.text.style.k r42, androidx.compose.ui.graphics.c6 r43, androidx.compose.ui.graphics.drawscope.i r44, androidx.compose.ui.text.style.j r45, androidx.compose.ui.text.style.l r46, long r47, androidx.compose.ui.text.style.q r49, androidx.compose.ui.text.f0 r50, androidx.compose.ui.text.style.h r51, androidx.compose.ui.text.style.f r52, androidx.compose.ui.text.style.e r53, androidx.compose.ui.text.style.s r54) {
        /*
            r25 = this;
            r0 = r50
            androidx.compose.ui.text.i0 r15 = new androidx.compose.ui.text.i0
            r23 = 0
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.d0 r1 = r50.getSpanStyle()
            r20 = r1
            goto L11
        Lf:
            r20 = r23
        L11:
            r22 = 0
            r1 = r15
            r2 = r26
            r3 = r27
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r21 = r44
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            androidx.compose.ui.text.y r1 = new androidx.compose.ui.text.y
            if (r45 == 0) goto L42
            int r2 = r45.getValue()
            goto L4b
        L42:
            androidx.compose.ui.text.style.j$a r2 = androidx.compose.ui.text.style.j.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.j.g()
        L4b:
            if (r46 == 0) goto L52
            int r3 = r46.getValue()
            goto L5b
        L52:
            androidx.compose.ui.text.style.l$a r3 = androidx.compose.ui.text.style.l.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.l.f()
        L5b:
            if (r0 == 0) goto L61
            androidx.compose.ui.text.c0 r23 = r50.getParagraphStyle()
        L61:
            if (r52 == 0) goto L68
            int r4 = r52.getMask()
            goto L71
        L68:
            androidx.compose.ui.text.style.f$a r4 = androidx.compose.ui.text.style.f.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.text.style.f.d()
        L71:
            if (r53 == 0) goto L78
            int r5 = r53.getValue()
            goto L81
        L78:
            androidx.compose.ui.text.style.e$a r5 = androidx.compose.ui.text.style.e.INSTANCE
            r5.getClass()
            int r5 = androidx.compose.ui.text.style.e.c()
        L81:
            r6 = 0
            r26 = r1
            r27 = r2
            r28 = r3
            r29 = r47
            r31 = r49
            r32 = r23
            r33 = r51
            r34 = r4
            r35 = r5
            r36 = r54
            r37 = r6
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.v0.<init>(androidx.compose.ui.graphics.t1, float, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.graphics.drawscope.i, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.f0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.s):void");
    }
}
