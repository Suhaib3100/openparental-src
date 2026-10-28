package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b¢\u0006\u0004\b\u0001\u0010\u0004\u001a(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b¢\u0006\u0004\b\u000b\u0010\u0004\u001aQ\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\t\u001a8\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001aa\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a8\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aa\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018\u001a_\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012%\b\u0001\u0010\u001c\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ag\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010 \u001a\u00020\u001f2%\b\u0001\u0010\u001c\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b!\u0010\"\u001a.\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b¢\u0006\u0004\b$\u0010%\u001aA\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b&\u0010%\u001a:\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b'\u0010(\u001aA\u0010+\u001a\u00028\u0001\"\u0014\b\u0000\u0010\u0011*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002*\u00028\u0001\"\u0004\b\u0001\u0010\u0015*\u00028\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a;\u0010/\u001a\u00020#\"\t\b\u0000\u0010\u0000¢\u0006\u0002\b-\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010.\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b/\u00100\u001a=\u00101\u001a\u0004\u0018\u00018\u0001\"\t\b\u0000\u0010\u0000¢\u0006\u0002\b-\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010.\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b1\u00102\u001a<\u00104\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010.\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u0001H\u0087\n¢\u0006\u0004\b4\u00105\u001a3\u00106\u001a\u00020#\"\t\b\u0000\u0010\u0000¢\u0006\u0002\b-*\u000e\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0002\b\u00030\u00022\u0006\u0010.\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b6\u00100\u001a9\u00107\u001a\u00020#\"\u0004\b\u0000\u0010\u0000\"\t\b\u0001\u0010\u0001¢\u0006\u0002\b-*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00103\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b7\u00100\u001a=\u00108\u001a\u0004\u0018\u00018\u0001\"\t\b\u0000\u0010\u0000¢\u0006\u0002\b-\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010.\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b8\u00102\u001a,\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0087\n¢\u0006\u0004\b:\u0010;\u001a,\u0010<\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0087\n¢\u0006\u0004\b<\u0010;\u001a8\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0087\b¢\u0006\u0004\b=\u0010>\u001aE\u0010?\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010.\u001a\u00028\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0087\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aE\u0010A\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010.\u001a\u00028\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0080\bø\u0001\u0000¢\u0006\u0004\bA\u0010@\u001a3\u0010\u0000\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010.\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0000\u00102\u001aE\u0010B\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010.\u001a\u00028\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010@\u001a@\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001090C\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\bD\u0010E\u001a>\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G0F\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0087\n¢\u0006\u0004\bH\u0010E\u001ay\u0010K\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0015\"\u0018\b\u0003\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00020\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010I\u001a\u00028\u00032\u001e\u0010J\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00028\u00020\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001ay\u0010M\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0015\"\u0018\b\u0003\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010I\u001a\u00028\u00032\u001e\u0010J\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00028\u00020\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\bM\u0010L\u001aI\u0010N\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\bN\u0010O\u001aG\u0010Q\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060P¢\u0006\u0004\bQ\u0010R\u001aG\u0010T\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060S¢\u0006\u0004\bT\u0010U\u001ac\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0015*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010J\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00028\u00020\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001ac\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0015*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010J\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00028\u00020\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\bX\u0010W\u001aQ\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\bZ\u0010W\u001aQ\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020#0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b[\u0010W\u001as\u0010\\\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010I\u001a\u00028\u00022\u001e\u0010Y\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00020#0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b\\\u0010L\u001a]\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010Y\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00020#0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b]\u0010W\u001as\u0010^\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010I\u001a\u00028\u00022\u001e\u0010Y\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00020#0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b^\u0010L\u001a]\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010Y\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\u0012\u0004\u0012\u00020#0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b_\u0010W\u001a;\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060P¢\u0006\u0004\b`\u0010a\u001aQ\u0010b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060P2\u0006\u0010I\u001a\u00028\u0002¢\u0006\u0004\bb\u0010c\u001a=\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\bd\u0010\t\u001aS\u0010e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010I\u001a\u00028\u0002¢\u0006\u0004\be\u0010f\u001a;\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060S¢\u0006\u0004\bg\u0010h\u001aQ\u0010i\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060S2\u0006\u0010I\u001a\u00028\u0002¢\u0006\u0004\bi\u0010j\u001a9\u0010k\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\bk\u0010(\u001a9\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\bl\u0010(\u001aO\u0010m\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0011*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010I\u001a\u00028\u0002H\u0007¢\u0006\u0004\bm\u0010n\u001aN\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\bp\u0010q\u001aT\u0010r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060PH\u0086\u0002¢\u0006\u0004\br\u0010s\u001aV\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0086\u0002¢\u0006\u0004\bt\u0010u\u001aT\u0010v\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060SH\u0086\u0002¢\u0006\u0004\bv\u0010w\u001aP\u0010y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010x\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002¢\u0006\u0004\by\u0010n\u001aD\u0010z\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0087\n¢\u0006\u0004\bz\u0010{\u001aJ\u0010|\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060PH\u0087\n¢\u0006\u0004\b|\u0010R\u001aL\u0010}\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0087\n¢\u0006\u0004\b}\u0010O\u001aJ\u0010~\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060SH\u0087\n¢\u0006\u0004\b~\u0010U\u001aE\u0010\u007f\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001aE\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010.\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001aK\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0087\u0002¢\u0006\u0005\b\u0084\u0001\u0010s\u001aN\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000f\u0010\u0083\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0087\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001aK\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0087\u0002¢\u0006\u0005\b\u0087\u0001\u0010w\u001a7\u0010\u0088\u0001\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010.\u001a\u00028\u0000H\u0087\n¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a=\u0010\u008a\u0001\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0087\n¢\u0006\u0005\b\u008a\u0001\u0010R\u001a@\u0010\u008b\u0001\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u000f\u0010\u0083\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0087\n¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a=\u0010\u008d\u0001\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0087\n¢\u0006\u0005\b\u008d\u0001\u0010U\u001a9\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0005\b\u008e\u0001\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"K", "V", "", "z", "()Ljava/util/Map;", "", "Lkotlin/q0;", "pairs", "W", "([Lkotlin/q0;)Ljava/util/Map;", "", "i0", "j0", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "L", "()Ljava/util/HashMap;", "M", "([Lkotlin/q0;)Ljava/util/HashMap;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "R", "()Ljava/util/LinkedHashMap;", "S", "([Lkotlin/q0;)Ljava/util/LinkedHashMap;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "t", "(Lld/l;)Ljava/util/Map;", "", "capacity", "s", "(ILld/l;)Ljava/util/Map;", "", "O", "(Ljava/util/Map;)Z", "P", "l0", "(Ljava/util/Map;)Ljava/util/Map;", "Lkotlin/Function0;", "defaultValue", "N", "(Ljava/util/Map;Lld/a;)Ljava/lang/Object;", "Lkotlin/internal/j;", "key", "w", "(Ljava/util/Map;Ljava/lang/Object;)Z", "G", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "value", "A0", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "x", "y", "z0", "", "u", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "v", "K0", "(Ljava/util/Map$Entry;)Lkotlin/q0;", "H", "(Ljava/util/Map;Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "I", "J", "", "Q", "(Ljava/util/Map;)Ljava/util/Iterator;", "", "", "h0", "destination", "transform", "Y", "(Ljava/util/Map;Ljava/util/Map;Lld/l;)Ljava/util/Map;", "U", "y0", "(Ljava/util/Map;[Lkotlin/q0;)V", "", "w0", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "Lkotlin/sequences/m;", "x0", "(Ljava/util/Map;Lkotlin/sequences/m;)V", "X", "(Ljava/util/Map;Lld/l;)Ljava/util/Map;", "T", "predicate", "B", "F", "E", "A", "D", "C", "B0", "(Ljava/lang/Iterable;)Ljava/util/Map;", "C0", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "H0", "I0", "([Lkotlin/q0;Ljava/util/Map;)Ljava/util/Map;", "F0", "(Lkotlin/sequences/m;)Ljava/util/Map;", "G0", "(Lkotlin/sequences/m;Ljava/util/Map;)Ljava/util/Map;", "D0", "J0", "E0", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "pair", "o0", "(Ljava/util/Map;Lkotlin/q0;)Ljava/util/Map;", "m0", "(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;", "q0", "(Ljava/util/Map;[Lkotlin/q0;)Ljava/util/Map;", "p0", "(Ljava/util/Map;Lkotlin/sequences/m;)Ljava/util/Map;", "map", "n0", "t0", "(Ljava/util/Map;Lkotlin/q0;)V", "r0", "v0", "u0", "s0", "(Ljava/util/Map;Ljava/util/Map;)V", "a0", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "Z", "c0", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "b0", "e0", "(Ljava/util/Map;Ljava/lang/Object;)V", "d0", "g0", "(Ljava/util/Map;[Ljava/lang/Object;)V", "f0", "k0", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@kotlin.jvm.internal.r1({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n403#1:814\n414#1:819\n511#1,6:824\n536#1,6:830\n1#2:805\n1238#3,4:806\n1238#3,4:810\n1238#3,4:815\n1238#3,4:820\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n453#1:814\n468#1:819\n526#1:824,6\n551#1:830,6\n403#1:806,4\n414#1:810,4\n453#1:815,4\n468#1:820,4\n*E\n"})
/* loaded from: classes7.dex */
public class c1 extends b1 {
    @fg.l
    public static final <K, V> Map<K, V> A(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愚\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <K, V> void A0(Map<K, V> map, K k4, V v4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        map.put(k4, v4);
    }

    @fg.l
    public static final <K, V> Map<K, V> B(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super K, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愚\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @fg.l
    public static <K, V> Map<K, V> B0(@fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愙\u0001"));
        if (!(iterable instanceof Collection)) {
            return k0(C0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size != 1) {
            return C0(iterable, new LinkedHashMap(b1.j(collection.size())));
        }
        return b1.k(iterable instanceof List ? (kotlin.q0<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @fg.l
    public static final <K, V> Map<K, V> C(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愚\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!lVar.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @fg.l
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable, @fg.l M m4) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        w0(m4, iterable);
        return m4;
    }

    @fg.l
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@fg.l Map<? extends K, ? extends V> map, @fg.l M m4, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愚\u0001"));
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!lVar.invoke(entry).booleanValue()) {
                m4.put(entry.getKey(), entry.getValue());
            }
        }
        return m4;
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static <K, V> Map<K, V> D0(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        int size = map.size();
        return size != 0 ? size != 1 ? J0(map) : b1.o(map) : z();
    }

    @fg.l
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@fg.l Map<? extends K, ? extends V> map, @fg.l M m4, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愚\u0001"));
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.invoke(entry).booleanValue()) {
                m4.put(entry.getKey(), entry.getValue());
            }
        }
        return m4;
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@fg.l Map<? extends K, ? extends V> map, @fg.l M m4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        m4.putAll(map);
        return m4;
    }

    @fg.l
    public static final <K, V> Map<K, V> F(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super V, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愚\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @fg.l
    public static final <K, V> Map<K, V> F0(@fg.l kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愙\u0001"));
        return k0(G0(mVar, new LinkedHashMap()));
    }

    @kotlin.internal.f
    private static final <K, V> V G(Map<? extends K, ? extends V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return map.get(k4);
    }

    @fg.l
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@fg.l kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> mVar, @fg.l M m4) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        x0(m4, mVar);
        return m4;
    }

    @kotlin.internal.f
    private static final <K, V> V H(Map<K, ? extends V> map, K k4, ld.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("愜\u0001"));
        V v4 = map.get(k4);
        return v4 == null ? aVar.invoke() : v4;
    }

    @fg.l
    public static <K, V> Map<K, V> H0(@fg.l kotlin.q0<? extends K, ? extends V>[] q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愙\u0001"));
        int length = q0VarArr.length;
        return length != 0 ? length != 1 ? I0(q0VarArr, new LinkedHashMap(b1.j(q0VarArr.length))) : b1.k(q0VarArr[0]) : z();
    }

    public static final <K, V> V I(@fg.l Map<K, ? extends V> map, K k4, @fg.l ld.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("愜\u0001"));
        V v4 = map.get(k4);
        return (v4 != null || map.containsKey(k4)) ? v4 : aVar.invoke();
    }

    @fg.l
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@fg.l kotlin.q0<? extends K, ? extends V>[] q0VarArr, @fg.l M m4) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        y0(m4, q0VarArr);
        return m4;
    }

    public static final <K, V> V J(@fg.l Map<K, V> map, K k4, @fg.l ld.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("愜\u0001"));
        V v4 = map.get(k4);
        if (v4 != null) {
            return v4;
        }
        V invoke = aVar.invoke();
        map.put(k4, invoke);
        return invoke;
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static <K, V> Map<K, V> J0(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return new LinkedHashMap(map);
    }

    @kotlin.c1(version = "1.1")
    public static <K, V> V K(@fg.l Map<K, ? extends V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return (V) a1.a(map, k4);
    }

    @kotlin.internal.f
    private static final <K, V> kotlin.q0<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("愙\u0001"));
        return new kotlin.q0<>(entry.getKey(), entry.getValue());
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @fg.l
    public static <K, V> HashMap<K, V> M(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        HashMap<K, V> hashMap = new HashMap<>(b1.j(q0VarArr.length));
        y0(hashMap, q0VarArr);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lld/a<+TR;>;)TR; */
    @kotlin.c1(version = "1.3")
    @kotlin.internal.f
    private static final Object N(Map map, ld.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("愜\u0001"));
        return map.isEmpty() ? aVar.invoke() : map;
    }

    @kotlin.internal.f
    private static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return !map.isEmpty();
    }

    @kotlin.c1(version = "1.3")
    @kotlin.internal.f
    private static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @kotlin.internal.f
    private static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return map.entrySet().iterator();
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @fg.l
    public static <K, V> LinkedHashMap<K, V> S(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        return (LinkedHashMap) I0(q0VarArr, new LinkedHashMap(b1.j(q0VarArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <K, V, R> Map<R, V> T(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愞\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(lVar.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@fg.l Map<? extends K, ? extends V> map, @fg.l M m4, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愞\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m4.put(lVar.invoke(entry), entry.getValue());
        }
        return m4;
    }

    @kotlin.internal.f
    private static final <K, V> Map<K, V> V() {
        return z();
    }

    @fg.l
    public static <K, V> Map<K, V> W(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        return q0VarArr.length > 0 ? I0(q0VarArr, new LinkedHashMap(b1.j(q0VarArr.length))) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <K, V, R> Map<K, R> X(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愞\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), lVar.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@fg.l Map<? extends K, ? extends V> map, @fg.l M m4, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愛\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愞\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m4.put(entry.getKey(), lVar.invoke(entry));
        }
        return m4;
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <K, V> Map<K, V> Z(@fg.l Map<? extends K, ? extends V> map, @fg.l Iterable<? extends K> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("感\u0001"));
        Map J0 = J0(map);
        d0.H0(J0.keySet(), iterable);
        return k0(J0);
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static <K, V> Map<K, V> a0(@fg.l Map<? extends K, ? extends V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        Map J0 = J0(map);
        J0.remove(k4);
        return k0(J0);
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <K, V> Map<K, V> b0(@fg.l Map<? extends K, ? extends V> map, @fg.l kotlin.sequences.m<? extends K> mVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("感\u0001"));
        Map J0 = J0(map);
        d0.J0(J0.keySet(), mVar);
        return k0(J0);
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <K, V> Map<K, V> c0(@fg.l Map<? extends K, ? extends V> map, @fg.l K[] kArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(kArr, ProtectedSandApp.s("感\u0001"));
        Map J0 = J0(map);
        d0.K0(J0.keySet(), kArr);
        return k0(J0);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("感\u0001"));
        d0.H0(map.keySet(), iterable);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void e0(Map<K, V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        map.remove(k4);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void f0(Map<K, V> map, kotlin.sequences.m<? extends K> mVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("感\u0001"));
        d0.J0(map.keySet(), mVar);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void g0(Map<K, V> map, K[] kArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(kArr, ProtectedSandApp.s("感\u0001"));
        d0.K0(map.keySet(), kArr);
    }

    @kd.i(name = "mutableIterator")
    @kotlin.internal.f
    private static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return map.entrySet().iterator();
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @fg.l
    public static <K, V> Map<K, V> j0(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b1.j(q0VarArr.length));
        y0(linkedHashMap, q0VarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <K, V> Map<K, V> k0(@fg.l Map<K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        int size = map.size();
        return size != 0 ? size != 1 ? map : b1.o(map) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @fg.l
    public static final <K, V> Map<K, V> m0(@fg.l Map<? extends K, ? extends V> map, @fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愝\u0001"));
        if (map.isEmpty()) {
            return B0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @fg.l
    public static <K, V> Map<K, V> n0(@fg.l Map<? extends K, ? extends V> map, @fg.l Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(map2, ProtectedSandApp.s("愠\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @fg.l
    public static <K, V> Map<K, V> o0(@fg.l Map<? extends K, ? extends V> map, @fg.l kotlin.q0<? extends K, ? extends V> q0Var) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("愡\u0001"));
        if (map.isEmpty()) {
            return b1.k(q0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(q0Var.e(), q0Var.f());
        return linkedHashMap;
    }

    @fg.l
    public static final <K, V> Map<K, V> p0(@fg.l Map<? extends K, ? extends V> map, @fg.l kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愝\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, mVar);
        return k0(linkedHashMap);
    }

    @fg.l
    public static final <K, V> Map<K, V> q0(@fg.l Map<? extends K, ? extends V> map, @fg.l kotlin.q0<? extends K, ? extends V>[] q0VarArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        if (map.isEmpty()) {
            return H0(q0VarArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, q0VarArr);
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愝\u0001"));
        w0(map, iterable);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.6")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> s(int i4, @InterfaceC1469b ld.l<? super Map<K, V>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愢\u0001"));
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d(i4);
        lVar.invoke(dVar);
        return b1.d(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(map2, ProtectedSandApp.s("愠\u0001"));
        map.putAll(map2);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.6")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> t(@InterfaceC1469b ld.l<? super Map<K, V>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愢\u0001"));
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        lVar.invoke(dVar);
        return b1.d(dVar);
    }

    @kotlin.internal.f
    private static final <K, V> void t0(Map<? super K, ? super V> map, kotlin.q0<? extends K, ? extends V> q0Var) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("愡\u0001"));
        map.put(q0Var.e(), q0Var.f());
    }

    @kotlin.internal.f
    private static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("愙\u0001"));
        return entry.getKey();
    }

    @kotlin.internal.f
    private static final <K, V> void u0(Map<? super K, ? super V> map, kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愝\u0001"));
        x0(map, mVar);
    }

    @kotlin.internal.f
    private static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("愙\u0001"));
        return entry.getValue();
    }

    @kotlin.internal.f
    private static final <K, V> void v0(Map<? super K, ? super V> map, kotlin.q0<? extends K, ? extends V>[] q0VarArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        y0(map, q0VarArr);
    }

    @kotlin.internal.f
    private static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return map.containsKey(k4);
    }

    public static <K, V> void w0(@fg.l Map<? super K, ? super V> map, @fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愝\u0001"));
        for (kotlin.q0<? extends K, ? extends V> q0Var : iterable) {
            map.put(q0Var.a(), q0Var.b());
        }
    }

    @kotlin.internal.f
    private static final <K> boolean x(Map<? extends K, ?> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return map.containsKey(k4);
    }

    public static <K, V> void x0(@fg.l Map<? super K, ? super V> map, @fg.l kotlin.sequences.m<? extends kotlin.q0<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愝\u0001"));
        for (kotlin.q0<? extends K, ? extends V> q0Var : mVar) {
            map.put(q0Var.a(), q0Var.b());
        }
    }

    @kotlin.internal.f
    private static final <K, V> boolean y(Map<K, ? extends V> map, V v4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return map.containsValue(v4);
    }

    public static <K, V> void y0(@fg.l Map<? super K, ? super V> map, @fg.l kotlin.q0<? extends K, ? extends V>[] q0VarArr) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("愝\u0001"));
        for (kotlin.q0<? extends K, ? extends V> q0Var : q0VarArr) {
            map.put(q0Var.a(), q0Var.b());
        }
    }

    @fg.l
    public static <K, V> Map<K, V> z() {
        k0 k0Var = k0.f74930b;
        kotlin.jvm.internal.l0.n(k0Var, ProtectedSandApp.s("愣\u0001"));
        return k0Var;
    }

    @kotlin.internal.f
    private static final <K, V> V z0(Map<? extends K, V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愙\u0001"));
        return (V) kotlin.jvm.internal.u1.k(map).remove(k4);
    }
}
