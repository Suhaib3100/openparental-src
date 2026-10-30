import Anthropic from '@anthropic-ai/sdk';

type EventRow = { type: string; data: Record<string, unknown>; occurredAt: string };
type ContentRow = {
  source: string;
  body: string;
  matched: string | null;
  counterparty: string | null;
  occurredAt: string;
};

export function aiConfigured(): boolean {
  return Boolean(process.env.ANTHROPIC_API_KEY?.trim());
}

/** Compact the raw activity into a small digest for the model (keeps tokens low). */
function digest(events: EventRow[], content: ContentRow[]): string {
  const appOpens: Record<string, number> = {};
  let installs = 0;
  let usageLine = '';
  for (const e of events) {
    if (e.type === 'APP_FOREGROUND') {
      const pkg = String(e.data.pkg ?? '');
      if (pkg) appOpens[pkg] = (appOpens[pkg] ?? 0) + 1;
    } else if (e.type === 'APP_INSTALLED') {
      installs++;
    } else if (e.type === 'USAGE_SUMMARY' && !usageLine) {
      const by = (e.data.minutesByApp ?? {}) as Record<string, number>;
      usageLine = Object.entries(by)
        .sort((a, b) => b[1] - a[1])
        .map(([p, m]) => `${p}=${m}m`)
        .join(', ');
    }
  }
  const bySource: Record<string, number> = {};
  const keywordHits: string[] = [];
  for (const c of content) {
    bySource[c.source] = (bySource[c.source] ?? 0) + 1;
    if (c.source === 'keyword' && c.matched) keywordHits.push(c.matched);
  }
  const topOpens = Object.entries(appOpens)
    .sort((a, b) => b[1] - a[1])
    .slice(0, 8)
    .map(([p, n]) => `${p}(${n})`)
    .join(', ');

  return [
    `App opens (top): ${topOpens || 'none'}`,
    `Daily usage minutes: ${usageLine || 'none reported'}`,
    `New installs: ${installs}`,
    `Content captured by source: ${JSON.stringify(bySource)}`,
    `Keyword flags: ${keywordHits.length ? keywordHits.join(', ') : 'none'}`,
    `Notification samples: ${content
      .filter((c) => c.source === 'notification')
      .slice(0, 5)
      .map((c) => c.body)
      .join(' | ') || 'none'}`,
  ].join('\n');
}

const SYSTEM = `You are a parental-insights assistant for an open, consent-based child-safety app.
You are given a privacy-minimized digest of a child's device activity. Write a short, warm, practical report for the parent.
Rules: no alarmism; be specific and balanced; call out genuine safety concerns (e.g. flagged keywords) plainly but calmly; suggest 2-3 concrete, age-appropriate actions. Do not invent data not present in the digest.
Format as short markdown with three sections: "Summary", "Worth a look", "Suggestions". Keep it under ~200 words.`;

export async function generateReport(
  events: EventRow[],
  content: ContentRow[],
): Promise<string> {
  const client = new Anthropic();
  const d = digest(events, content);
  const response = await client.messages.create({
    model: 'claude-opus-5-5',
    max_tokens: 1200, // deliberately short parent-facing report
    system: SYSTEM,
    messages: [
      {
        role: 'user',
        content: `Here is the activity digest for the child's device:\n\n${d}\n\nWrite the report.`,
      },
    ],
  });
  return response.content
    .filter((b): b is Anthropic.TextBlock => b.type === 'text')
    .map((b) => b.text)
    .join('\n')
    .trim();
}
