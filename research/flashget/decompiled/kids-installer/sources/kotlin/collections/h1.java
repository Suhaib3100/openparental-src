package kotlin.collections;

import a0.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.sequences.Sequence;

/* compiled from: _Maps.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001aJ\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001a9\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004H\u0087\b\u001a6\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001a'\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004H\u0087\b\u001aJ\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001a[\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a]\u0010\u0014\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\\\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0006H\u0086\bø\u0001\u0000\u001aa\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\f0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001au\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aw\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\f0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001aJ\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u001f0\u0006H\u0087\bø\u0001\u0000\u001aV\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0086\bø\u0001\u0000\u001a\\\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0086\bø\u0001\u0000\u001au\u0010#\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010$\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ak\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b(\u001ah\u0010)\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000\u001a_\u0010*\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aJ\u0010*\u001a\u00020,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010*\u001a\u00020-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000\u001aa\u0010.\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aQ\u0010.\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aQ\u0010.\u001a\u0004\u0018\u00010-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001aq\u00101\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001as\u00106\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001al\u00107\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b¢\u0006\u0002\b8\u001ai\u00109\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b\u001ak\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b;\u001ah\u0010<\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000\u001a_\u0010=\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aJ\u0010=\u001a\u00020,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010=\u001a\u00020-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000\u001aa\u0010>\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aQ\u0010>\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aQ\u0010>\u001a\u0004\u0018\u00010-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001aq\u0010?\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001as\u0010@\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001al\u0010A\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b¢\u0006\u0002\bB\u001ai\u0010C\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b\u001a$\u0010D\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001aJ\u0010D\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001aY\u0010E\u001a\u0002HF\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010F*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002HF2\u001e\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u001f0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010G\u001an\u0010H\u001a\u0002HF\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010F*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002HF23\u0010 \u001a/\u0012\u0013\u0012\u00110\u000e¢\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u001f0IH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010M\u001a6\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030O0\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006P"}, d2 = {"all", "", "K", "V", "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", "count", "", "firstNotNullOf", "R", "", "transform", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstNotNullOfOrNull", "flatMap", "", "flatMapSequence", "flatMapTo", "C", "", "destination", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "flatMapSequenceTo", "forEach", "", "action", "map", "mapNotNull", "mapNotNullTo", "mapTo", "maxBy", "", "selector", "maxByOrThrow", "maxByOrNull", "maxOf", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "", "", "maxOfOrNull", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Double;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Float;", "maxOfWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Map;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxOfWithOrNull", "maxWith", "maxWithOrThrow", "maxWithOrNull", "minBy", "minByOrThrow", "minByOrNull", "minOf", "minOfOrNull", "minOfWith", "minOfWithOrNull", "minWith", "minWithOrThrow", "minWithOrNull", "none", "onEach", "M", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "onEachIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "toList", "Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
/* loaded from: classes6.dex */
class h1 extends g1 {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> Float A1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氻"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("氼"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.N((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.N((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氽"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("氾"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("氿"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.N((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.N((Object) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汀"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("汁"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("求"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) lVar.N((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.N((Object) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (Object) obj2;
            }
        }
        return obj;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汃"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("汄"));
        return (Map.Entry) j0.n4(map.entrySet(), comparator);
    }

    @p3.i(name = "minWithOrThrow")
    @SinceKotlin(version = "1.7")
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汅"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("汆"));
        return (Map.Entry) j0.o4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@d5.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汇"));
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汈"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汉"));
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.N(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@d5.d M m5, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, m2> lVar) {
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("汊"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汋"));
        Iterator<Map.Entry<K, V>> it = m5.entrySet().iterator();
        while (it.hasNext()) {
            lVar.N(it.next());
        }
        return m5;
    }

    @SinceKotlin(version = "1.4")
    @d5.d
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@d5.d M m5, @d5.d q3.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, m2> pVar) {
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("汌"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("汍"));
        Iterator<T> it = m5.entrySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            c.C0000c.a aVar = (Object) it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                a0.Z();
            }
            pVar.g0(Integer.valueOf(i5), aVar);
            i5 = i6;
        }
        return m5;
    }

    @d5.d
    public static final <K, V> List<Pair<K, V>> J1(@d5.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汎"));
        if (map.size() == 0) {
            return EmptyList.f23167o;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return EmptyList.f23167o;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return z.k(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汏"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汐"));
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!lVar.N(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@d5.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汑"));
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汒"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汓"));
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.N(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InlineOnly
    private static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汔"));
        return map.entrySet();
    }

    @d5.d
    public static final <K, V> Sequence<Map.Entry<K, V>> T0(@d5.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汕"));
        return j0.A1(map.entrySet());
    }

    @InlineOnly
    private static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汖"));
        return map.size();
    }

    public static final <K, V> int V0(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汗"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汘"));
        int i5 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.N(it.next()).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <K, V, R> R W0(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        R r5;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汙"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汚"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r5 = null;
                break;
            }
            r5 = lVar.N(it.next());
            if (r5 != null) {
                break;
            }
        }
        if (r5 != null) {
            return r5;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("汛"));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <K, V, R> R X0(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汜"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汝"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R N = lVar.N(it.next());
            if (N != null) {
                return N;
            }
        }
        return null;
    }

    @d5.d
    public static final <K, V, R> List<R> Y0(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汞"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("江"));
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            f0.q0(arrayList, lVar.N(it.next()));
        }
        return arrayList;
    }

    @p3.i(name = "flatMapSequence")
    @d5.d
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    public static final <K, V, R> List<R> Z0(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("池"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("污"));
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            f0.r0(arrayList, lVar.N(it.next()));
        }
        return arrayList;
    }

    @p3.i(name = "flatMapSequenceTo")
    @d5.d
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    public static final <K, V, R, C extends Collection<? super R>> C a1(@d5.d Map<? extends K, ? extends V> map, @d5.d C c6, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汢"));
        kotlin.jvm.internal.l0.p(c6, ProtectedSandApp.s("汣"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汤"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            f0.r0(c6, lVar.N(it.next()));
        }
        return c6;
    }

    @d5.d
    public static final <K, V, R, C extends Collection<? super R>> C b1(@d5.d Map<? extends K, ? extends V> map, @d5.d C c6, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汥"));
        kotlin.jvm.internal.l0.p(c6, ProtectedSandApp.s("汦"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汧"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            f0.q0(c6, lVar.N(it.next()));
        }
        return c6;
    }

    @HidesMembers
    public static final <K, V> void c1(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, m2> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汨"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汩"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            lVar.N(it.next());
        }
    }

    @d5.d
    public static final <K, V, R> List<R> d1(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汪"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汫"));
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.N(it.next()));
        }
        return arrayList;
    }

    @d5.d
    public static final <K, V, R> List<R> e1(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汬"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汭"));
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R N = lVar.N(it.next());
            if (N != null) {
                arrayList.add(N);
            }
        }
        return arrayList;
    }

    @d5.d
    public static final <K, V, R, C extends Collection<? super R>> C f1(@d5.d Map<? extends K, ? extends V> map, @d5.d C c6, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汮"));
        kotlin.jvm.internal.l0.p(c6, ProtectedSandApp.s("汯"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汰"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R N = lVar.N(it.next());
            if (N != null) {
                c6.add(N);
            }
        }
        return c6;
    }

    @d5.d
    public static final <K, V, R, C extends Collection<? super R>> C g1(@d5.d Map<? extends K, ? extends V> map, @d5.d C c6, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汱"));
        kotlin.jvm.internal.l0.p(c6, ProtectedSandApp.s("汲"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汳"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c6.add(lVar.N(it.next()));
        }
        return c6;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汴"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汵"));
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R N = lVar.N(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R N2 = lVar.N(entry3);
                    if (N.compareTo(N2) < 0) {
                        entry2 = entry3;
                        N = N2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @p3.i(name = "maxByOrThrow")
    @SinceKotlin(version = "1.7")
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汶"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汷"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R N = lVar.N(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R N2 = lVar.N(entry2);
                if (N.compareTo(N2) < 0) {
                    entry = entry2;
                    N = N2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> double j1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汸"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汹"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.N((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.N((Object) it.next()).doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> float k1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("決"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汻"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.N((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.N((Object) it.next()).floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汼"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汽"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R N = lVar.N((Object) it.next());
        while (it.hasNext()) {
            R N2 = lVar.N((Object) it.next());
            if (N.compareTo(N2) < 0) {
                N = N2;
            }
        }
        return N;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("汾"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("汿"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R N = lVar.N((Object) it.next());
        while (it.hasNext()) {
            R N2 = lVar.N((Object) it.next());
            if (N.compareTo(N2) < 0) {
                N = N2;
            }
        }
        return N;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> Double n1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沀"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沁"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.N((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.N((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> Float o1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沂"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沃"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.N((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.N((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沄"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("沅"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沆"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.N((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.N((Object) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沇"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("沈"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沉"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) lVar.N((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.N((Object) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (Object) obj2;
            }
        }
        return obj;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沊"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("沋"));
        return (Map.Entry) j0.V3(map.entrySet(), comparator);
    }

    @p3.i(name = "maxWithOrThrow")
    @SinceKotlin(version = "1.7")
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沌"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("沍"));
        return (Map.Entry) j0.W3(map.entrySet(), comparator);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沎"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沏"));
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R N = lVar.N(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R N2 = lVar.N(entry3);
                    if (N.compareTo(N2) > 0) {
                        entry2 = entry3;
                        N = N2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @p3.i(name = "minByOrThrow")
    @SinceKotlin(version = "1.7")
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沐"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沑"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R N = lVar.N(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R N2 = lVar.N(entry2);
                if (N.compareTo(N2) > 0) {
                    entry = entry2;
                    N = N2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> double v1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沒"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沓"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.N((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.N((Object) it.next()).doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> float w1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沔"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沕"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.N((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.N((Object) it.next()).floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沖"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沗"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R N = lVar.N((Object) it.next());
        while (it.hasNext()) {
            R N2 = lVar.N((Object) it.next());
            if (N.compareTo(N2) > 0) {
                N = N2;
            }
        }
        return N;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沘"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沙"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R N = lVar.N((Object) it.next());
        while (it.hasNext()) {
            R N2 = lVar.N((Object) it.next());
            if (N.compareTo(N2) > 0) {
                N = N2;
            }
        }
        return N;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> Double z1(Map<? extends K, ? extends V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("沚"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沛"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.N((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.N((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }
}
