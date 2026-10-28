package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.builders.MapBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010(\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a`\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052%\b\u0001\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aX\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032%\b\u0001\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\u001a1\u0010\f\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\rj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a_\u0010\f\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\rj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0014j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a_\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0014j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0016\u001a!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0018\u001a!\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0018\u001a*\u0010\u001a\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\n¢\u0006\u0002\u0010\u001c\u001a*\u0010\u001d\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\n¢\u0006\u0002\u0010\u001c\u001a9\u0010\u001e\u001a\u00020\u001f\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\"\u001a1\u0010#\u001a\u00020\u001f\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b *\u000e\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\"\u001a7\u0010$\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\t\b\u0001\u0010\u0003¢\u0006\u0002\b *\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010%\u001a\u0002H\u0003H\u0087\b¢\u0006\u0002\u0010\"\u001aV\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aJ\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aV\u0010)\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aq\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aq\u0010.\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aJ\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001a;\u00100\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u00101\u001aC\u00102\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001aC\u00106\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0080\bø\u0001\u0000¢\u0006\u0002\u00105\u001aC\u00107\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0086\bø\u0001\u0000¢\u0006\u0002\u00105\u001a1\u00108\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u00101\u001a?\u00109\u001a\u0002H:\"\u0014\b\u0000\u0010+*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001*\u0002H:\"\u0004\b\u0001\u0010:*\u0002H+2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H:04H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010;\u001a'\u0010<\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b\u001a:\u0010=\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a9\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b0?\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a<\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030A0@\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\bH\u0087\n¢\u0006\u0002\bB\u001a\\\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000\u001aw\u0010E\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:\"\u0018\b\u0003\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H:\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a\\\u0010F\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H:0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000\u001aw\u0010G\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:\"\u0018\b\u0003\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H:0\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a@\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\u0002¢\u0006\u0002\u0010I\u001aH\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010H\u0087\u0002¢\u0006\u0002\u0010K\u001aA\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020LH\u0087\u0002\u001aA\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0087\u0002\u001a2\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010O\u001a:\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u000e\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010H\u0087\n¢\u0006\u0002\u0010P\u001a3\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020LH\u0087\n\u001a3\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0087\n\u001a0\u0010Q\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u001a3\u0010R\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u001aT\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010H\u0086\u0002¢\u0006\u0002\u0010T\u001aG\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011H\u0086\u0002\u001aM\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110LH\u0086\u0002\u001aI\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010V\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001aM\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110MH\u0086\u0002\u001aJ\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010H\u0087\n¢\u0006\u0002\u0010X\u001a=\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011H\u0087\n\u001aC\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110LH\u0087\n\u001a=\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001aC\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110MH\u0087\n\u001aG\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010¢\u0006\u0002\u0010X\u001a@\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L\u001a@\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M\u001a;\u0010Z\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u00101\u001a:\u0010[\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u00022\u0006\u0010%\u001a\u0002H\u0003H\u0087\n¢\u0006\u0002\u0010\\\u001a;\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010¢\u0006\u0002\u0010\u0018\u001aQ\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u00102\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010^\u001a4\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L\u001aO\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L2\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010_\u001a2\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aM\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+H\u0007¢\u0006\u0002\u0010`\u001a4\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M\u001aO\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M2\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010a\u001a2\u0010b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a1\u0010c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"buildMap", "", "K", "V", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "emptyMap", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "contains", "", "Lkotlin/internal/OnlyInputTypes;", "key", "(Ljava/util/Map;Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "filter", "predicate", "filterKeys", "filterNot", "filterNotTo", "M", "destination", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterTo", "filterValues", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getOrPut", "getValue", "ifEmpty", "R", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "iterator", "", "", "", "mutableIterator", "mapKeys", "transform", "mapKeysTo", "mapValues", "mapValuesTo", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "", "Lkotlin/sequences/Sequence;", "minusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "orEmpty", "plus", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "pair", "map", "plusAssign", "(Ljava/util/Map;[Lkotlin/Pair;)V", "putAll", "remove", "set", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toMap", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "toPair", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n403#1:814\n414#1:819\n511#1,6:824\n536#1,6:830\n1#2:805\n1238#3,4:806\n1238#3,4:810\n1238#3,4:815\n1238#3,4:820\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n453#1:814\n468#1:819\n526#1:824,6\n551#1:830,6\n403#1:806,4\n414#1:810,4\n453#1:815,4\n468#1:820,4\n*E\n"})
/* loaded from: classes6.dex */
public class f1 extends e1 {
    @d5.d
    public static final <K, V> Map<K, V> A(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毊"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毋"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.N(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> void A0(Map<K, V> map, K k5, V v5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毌"));
        map.put(k5, v5);
    }

    @d5.d
    public static final <K, V> Map<K, V> B(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super K, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("母"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毎"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.N(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @d5.d
    public static <K, V> Map<K, V> B0(@d5.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("每"));
        if (!(iterable instanceof Collection)) {
            return k0(C0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size != 1) {
            return C0(iterable, new LinkedHashMap(e1.j(collection.size())));
        }
        return e1.k(iterable instanceof List ? (Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @d5.d
    public static final <K, V> Map<K, V> C(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毐"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毑"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!lVar.N(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @d5.d
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@d5.d Iterable<? extends Pair<? extends K, ? extends V>> iterable, @d5.d M m5) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("毒"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毓"));
        w0(m5, iterable);
        return m5;
    }

    @d5.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@d5.d Map<? extends K, ? extends V> map, @d5.d M m5, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("比"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毕"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毖"));
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!lVar.N(entry).booleanValue()) {
                m5.put(entry.getKey(), entry.getValue());
            }
        }
        return m5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static <K, V> Map<K, V> D0(@d5.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毗"));
        int size = map.size();
        return size != 0 ? size != 1 ? J0(map) : e1.o(map) : z();
    }

    @d5.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@d5.d Map<? extends K, ? extends V> map, @d5.d M m5, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毘"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毙"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毚"));
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.N(entry).booleanValue()) {
                m5.put(entry.getKey(), entry.getValue());
            }
        }
        return m5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@d5.d Map<? extends K, ? extends V> map, @d5.d M m5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毛"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毜"));
        m5.putAll(map);
        return m5;
    }

    @d5.d
    public static final <K, V> Map<K, V> F(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super V, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毝"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毞"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.N(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @d5.d
    public static final <K, V> Map<K, V> F0(@d5.d Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("毟"));
        return k0(G0(sequence, new LinkedHashMap()));
    }

    @InlineOnly
    private static final <K, V> V G(Map<? extends K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毠"));
        return map.get(k5);
    }

    @d5.d
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@d5.d Sequence<? extends Pair<? extends K, ? extends V>> sequence, @d5.d M m5) {
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("毡"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毢"));
        x0(m5, sequence);
        return m5;
    }

    @InlineOnly
    private static final <K, V> V H(Map<K, ? extends V> map, K k5, q3.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毣"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("毤"));
        V v5 = map.get(k5);
        return v5 == null ? aVar.n() : v5;
    }

    @d5.d
    public static final <K, V> Map<K, V> H0(@d5.d Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("毥"));
        int length = pairArr.length;
        return length != 0 ? length != 1 ? I0(pairArr, new LinkedHashMap(e1.j(pairArr.length))) : e1.k(pairArr[0]) : z();
    }

    public static final <K, V> V I(@d5.d Map<K, ? extends V> map, K k5, @d5.d q3.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毦"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("毧"));
        V v5 = map.get(k5);
        return (v5 != null || map.containsKey(k5)) ? v5 : aVar.n();
    }

    @d5.d
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@d5.d Pair<? extends K, ? extends V>[] pairArr, @d5.d M m5) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("毨"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毩"));
        y0(m5, pairArr);
        return m5;
    }

    public static final <K, V> V J(@d5.d Map<K, V> map, K k5, @d5.d q3.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毪"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("毫"));
        V v5 = map.get(k5);
        if (v5 != null) {
            return v5;
        }
        V n5 = aVar.n();
        map.put(k5, n5);
        return n5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static <K, V> Map<K, V> J0(@d5.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毬"));
        return new LinkedHashMap(map);
    }

    @SinceKotlin(version = "1.1")
    public static <K, V> V K(@d5.d Map<K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毭"));
        return (V) d1.a(map, k5);
    }

    @InlineOnly
    private static final <K, V> Pair<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("毮"));
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @d5.d
    public static <K, V> HashMap<K, V> M(@d5.d Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("毯"));
        HashMap<K, V> hashMap = new HashMap<>(e1.j(pairArr.length));
        y0(hashMap, pairArr);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lq3/a<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object N(Map map, q3.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("毰"));
        return map.isEmpty() ? aVar.n() : map;
    }

    @InlineOnly
    private static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毱"));
        return !map.isEmpty();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毲"));
        return map.entrySet().iterator();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @d5.d
    public static final <K, V> LinkedHashMap<K, V> S(@d5.d Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("毳"));
        return (LinkedHashMap) I0(pairArr, new LinkedHashMap(e1.j(pairArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <K, V, R> Map<R, V> T(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毴"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毵"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(lVar.N(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@d5.d Map<? extends K, ? extends V> map, @d5.d M m5, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毶"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毷"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毸"));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m5.put(lVar.N(entry), entry.getValue());
        }
        return m5;
    }

    @InlineOnly
    private static final <K, V> Map<K, V> V() {
        return z();
    }

    @d5.d
    public static <K, V> Map<K, V> W(@d5.d Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("毹"));
        return pairArr.length > 0 ? I0(pairArr, new LinkedHashMap(e1.j(pairArr.length))) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <K, V, R> Map<K, R> X(@d5.d Map<? extends K, ? extends V> map, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毺"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毻"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), lVar.N(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@d5.d Map<? extends K, ? extends V> map, @d5.d M m5, @d5.d q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毼"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("毽"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("毾"));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m5.put(entry.getKey(), lVar.N(entry));
        }
        return m5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <K, V> Map<K, V> Z(@d5.d Map<? extends K, ? extends V> map, @d5.d Iterable<? extends K> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("毿"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("氀"));
        Map J0 = J0(map);
        f0.H0(J0.keySet(), iterable);
        return k0(J0);
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <K, V> Map<K, V> a0(@d5.d Map<? extends K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氁"));
        Map J0 = J0(map);
        J0.remove(k5);
        return k0(J0);
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <K, V> Map<K, V> b0(@d5.d Map<? extends K, ? extends V> map, @d5.d Sequence<? extends K> sequence) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氂"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("氃"));
        Map J0 = J0(map);
        f0.J0(J0.keySet(), sequence);
        return k0(J0);
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <K, V> Map<K, V> c0(@d5.d Map<? extends K, ? extends V> map, @d5.d K[] kArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氄"));
        kotlin.jvm.internal.l0.p(kArr, ProtectedSandApp.s("氅"));
        Map J0 = J0(map);
        f0.K0(J0.keySet(), kArr);
        return k0(J0);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氆"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("氇"));
        f0.H0(map.keySet(), iterable);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void e0(Map<K, V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氈"));
        map.remove(k5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void f0(Map<K, V> map, Sequence<? extends K> sequence) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氉"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("氊"));
        f0.J0(map.keySet(), sequence);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void g0(Map<K, V> map, K[] kArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氋"));
        kotlin.jvm.internal.l0.p(kArr, ProtectedSandApp.s("氌"));
        f0.K0(map.keySet(), kArr);
    }

    @p3.i(name = "mutableIterator")
    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氍"));
        return map.entrySet().iterator();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @d5.d
    public static final <K, V> Map<K, V> j0(@d5.d Pair<? extends K, ? extends V>... pairArr) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("氎"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e1.j(pairArr.length));
        y0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <K, V> Map<K, V> k0(@d5.d Map<K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氏"));
        int size = map.size();
        return size != 0 ? size != 1 ? map : e1.o(map) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @d5.d
    public static final <K, V> Map<K, V> m0(@d5.d Map<? extends K, ? extends V> map, @d5.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氐"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("民"));
        if (map.isEmpty()) {
            return B0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @d5.d
    public static <K, V> Map<K, V> n0(@d5.d Map<? extends K, ? extends V> map, @d5.d Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氒"));
        kotlin.jvm.internal.l0.p(map2, ProtectedSandApp.s("氓"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @d5.d
    public static final <K, V> Map<K, V> o0(@d5.d Map<? extends K, ? extends V> map, @d5.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("气"));
        kotlin.jvm.internal.l0.p(pair, ProtectedSandApp.s("氕"));
        if (map.isEmpty()) {
            return e1.k(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.e(), pair.f());
        return linkedHashMap;
    }

    @d5.d
    public static final <K, V> Map<K, V> p0(@d5.d Map<? extends K, ? extends V> map, @d5.d Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氖"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("気"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, sequence);
        return k0(linkedHashMap);
    }

    @d5.d
    public static final <K, V> Map<K, V> q0(@d5.d Map<? extends K, ? extends V> map, @d5.d Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氘"));
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("氙"));
        if (map.isEmpty()) {
            return H0(pairArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氚"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("氛"));
        w0(map, iterable);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <K, V> Map<K, V> s(int i5, @BuilderInference q3.l<? super Map<K, V>, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("氜"));
        MapBuilder mapBuilder = new MapBuilder(i5);
        lVar.N(mapBuilder);
        return e1.d(mapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氝"));
        kotlin.jvm.internal.l0.p(map2, ProtectedSandApp.s("氞"));
        map.putAll(map2);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <K, V> Map<K, V> t(@BuilderInference q3.l<? super Map<K, V>, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("氟"));
        MapBuilder mapBuilder = new MapBuilder();
        lVar.N(mapBuilder);
        return e1.d(mapBuilder);
    }

    @InlineOnly
    private static final <K, V> void t0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氠"));
        kotlin.jvm.internal.l0.p(pair, ProtectedSandApp.s("氡"));
        map.put(pair.e(), pair.f());
    }

    @InlineOnly
    private static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("氢"));
        return entry.getKey();
    }

    @InlineOnly
    private static final <K, V> void u0(Map<? super K, ? super V> map, Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氣"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("氤"));
        x0(map, sequence);
    }

    @InlineOnly
    private static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("氥"));
        return entry.getValue();
    }

    @InlineOnly
    private static final <K, V> void v0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氦"));
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("氧"));
        y0(map, pairArr);
    }

    @InlineOnly
    private static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氨"));
        return map.containsKey(k5);
    }

    public static final <K, V> void w0(@d5.d Map<? super K, ? super V> map, @d5.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氩"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("氪"));
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.a(), pair.b());
        }
    }

    @InlineOnly
    private static final <K> boolean x(Map<? extends K, ?> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氫"));
        return map.containsKey(k5);
    }

    public static final <K, V> void x0(@d5.d Map<? super K, ? super V> map, @d5.d Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氬"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("氭"));
        for (Pair<? extends K, ? extends V> pair : sequence) {
            map.put(pair.a(), pair.b());
        }
    }

    @InlineOnly
    private static final <K, V> boolean y(Map<K, ? extends V> map, V v5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氮"));
        return map.containsValue(v5);
    }

    public static final <K, V> void y0(@d5.d Map<? super K, ? super V> map, @d5.d Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氯"));
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("氰"));
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.a(), pair.b());
        }
    }

    @d5.d
    public static <K, V> Map<K, V> z() {
        EmptyMap emptyMap = EmptyMap.f23172o;
        kotlin.jvm.internal.l0.n(emptyMap, ProtectedSandApp.s("氱"));
        return emptyMap;
    }

    @InlineOnly
    private static final <K, V> V z0(Map<? extends K, V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("氲"));
        return (V) kotlin.jvm.internal.u1.k(map).remove(k5);
    }
}
