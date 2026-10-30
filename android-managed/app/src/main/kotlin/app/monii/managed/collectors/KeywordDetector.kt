package app.monii.managed.collectors

/**
 * On-device keyword detection for social media safety.
 *
 * Scans notification text and accessibility-captured screen text against a
 * curated set of watch-words. When a match is found the calling code should
 * report it via MoniiRepository.bufferEvent() or reportContent().
 *
 * Keyword lists are stored on-device so no user content ever leaves the
 * device unencrypted — the matched keyword + a snippet are sent to the
 * backend for the parent alert.
 */
object KeywordDetector {

    /** Social apps we monitor for keyword matches. */
    val MONITORED_PACKAGES = setOf(
        "com.instagram.android",
        "com.google.android.apps.youtube",
        "com.zhiliaoapp.musically",       // TikTok
        "com.twitter.android",            // X / Twitter
        "com.snapchat.android",
        "com.facebook.katana",            // Facebook
        "com.facebook.orca",              // Messenger
        "com.whatsapp",
        "com.whatsapp.w4b",               // WhatsApp Business
        "com.tencent.mm",                 // WeChat
        "com.google.android.apps.plus",   // Google+
        "org.telegram.messenger",         // Telegram
        "com.discord",
        "com.reddit.frontpage",           // Reddit
    )

    // ── Keyword categories ──

    private val DRUGS = setOf(
        "drugs", "weed", "cocaine", "coke", "mdma", "ecstasy", "xanax",
        "ketamine", "lsd", "acid", "shrooms", "mushrooms", "meth",
        "amphetamine", "adderall", "vyvanse", "oxys", "percocet",
        "vicodin", "norco", "lean", "sizzurp", "purple drank",
        "molly", "crystal", "ice", "heroin", "h", "brown sugar",
        "opium", "codeine", "morphine", "fentanyl", "valium", "diazepam",
        "tramadol", "suboxone", "dab", "dabs", "wax", "shatter",
        "thc vape", "delta 8", "delta 9", "thc-o", "thc-p",
        "kush", "loud", "gas", "exotic", "za", "zaza",
        "budo", "ganja", "bhang", "charas", "hash",
        "edibles", "gummies", "space cakes",
        "rc", "research chemical", "noids", "synthetic weed",
        "k2", "spice", "bath salts", "flakka",
        "poppers", "amyl nitrite", "nitrous", "laughing gas",
        "whippets", "salvia", "kratom", "phenibut",
        "roofies", "rufies", "ghb", "gbl",
    )

    private val ALCOHOL = setOf(
        "alcohol", "beer", "vodka", "whiskey", "whisky", "rum",
        "tequila", "gin", "brandy", "cognac", "wine", "champagne",
        "liquor", "booze", "moonshine", "homebrew", "home brew",
        "cocktail", "mixed drink", "hard seltzer", "binge drink",
        "shot", "shots", "chug", "pregame", "pregaming",
        "beer bong", "keg", "keger", "funnel", "beirut", "beer pong",
        "flask", "hip flask", "tallboy", "forty", "40 oz",
        "absinthe", "sake", "soju", "mead", "hard cider",
        "underage drink", "fake id", "stolen liquor",
    )

    private val SUICIDE_SELF_HARM = setOf(
        "suicide", "kill myself", "end my life", "end it all",
        "self harm", "selfharm", "cutting", "cut myself",
        "not want to live", "better off dead", "want to die",
        "sewer side", "sewer slide", "kms", "kys", "k y s",
        "no reason to live", "can't go on", "overdose",
        "take my life", "hurt myself",
        "blade", "razor", "pills", "sleep forever",
        "self delete", "unalive", "commit not alive",
        "triggered", "s/h", "depressed af", "ending it",
        "rope", "hang myself", "jump off",
    )

    private val VIOLENCE_BULLYING = setOf(
        "kill you", "hurt you", "beat you", "beat up",
        "slap", "punch", "fight me", "come fight",
        "shoot", "gun", "knife", "weapon", "blade",
        "bomb", "explode", "massacre", "school shooting",
        "shooting up", "terrorist", "isis", "taliban",
        "hate crime", "murder", "strangle", "stab",
        "gang", "bloods", "crips", "ms13",
        "jump you", "jump him", "jump her",
        "fist fight", "brawl", "reckless",
        "extort", "blackmail", "threaten",
        "fight club", "back alley", "shank",
        "pistol whip", "drive by", "hitman",
    )

    private val SEXUAL_CONTENT = setOf(
        "nudes", "naked", "sext", "sexting", "send nudes",
        "nsfw", "onlyfans", "porn", "porno", "pornhub",
        "xvideos", "xnxx", "redtube", "youporn",
        "sex chat", "cam girl", "cam boy", "live cam",
        "kik", "kik me", "skype sex", "zoom sex",
        "titty", "titties", "boobs", "ass", "pussy", "dick",
        "blowjob", "bj", "handjob", "hj", "head",
        "fuck", "fucking", "fucked",
        "hookup", "hook up", "casual sex", "one night",
        "slut", "whore", "hoe", "bitch",
        "horny", "thirsty", "down to fuck",
        "ddf", "std", "sti", "clean only",
        "tinder", "bumble", "hinge", "grindr",
        "sugar daddy", "sugar baby", "sugar momma",
        "age 18", "age 19", "add me", "dm me",
        "trade pics", "trade nudes",
        "lewd", "explicit", "18+", "nsfw content",
    )

    private val PREDATOR = setOf(
        "how old are you", "asl", "age/sex/location",
        "are you alone", "parents home",
        "send pic", "send photo", "face pic",
        "what are you wearing", "take off your",
        "show me", "let me see", "can i see",
        "secret", "don't tell", "keep this between",
        "meet me", "come over", "my place",
        "your place", "alone", "sneak out",
        "lie to your parents", "say you're at",
        "grooming", "groomer",
        "special friend", "special relationship",
        "too mature for your age",
        "you're not like other kids",
        "do you trust me", "i won't tell",
        "our little secret", "just between us",
        "private chat", "move to dm", "check your dms",
        "young", "teen", "minor", "underage",
    )

    /**
     * All categories consolidated. The key is the category slug used in
     * ContentArchive.source field ("keyword").
     */
    private val ALL_KEYWORDS: Map<String, Set<String>> =
        mapOf(
            "drugs" to DRUGS,
            "alcohol" to ALCOHOL,
            "suicide" to SUICIDE_SELF_HARM,
            "violence" to VIOLENCE_BULLYING,
            "sexual" to SEXUAL_CONTENT,
            "predator" to PREDATOR,
        )

    private val CATEGORY_LABELS: Map<String, String> =
        mapOf(
            "drugs" to "Drugs",
            "alcohol" to "Alcohol",
            "suicide" to "Suicide & Self Harm",
            "violence" to "Violence & Bullying",
            "sexual" to "Sexual Content",
            "predator" to "Grooming / Predator",
        )

    /** Maximum length of text snippet to send to backend. */
    private const val MAX_SNIPPET = 512

    // ── Public API ──

    fun categoryLabel(category: String): String =
        CATEGORY_LABELS[category] ?: category

    /**
     * Scan [text] against all keyword lists. Returns a list of matches
     * (category → matched keyword). Multiple matches in the same category
     * are deduped.
     */
    fun scan(text: String, extraKeywords: Set<String> = emptySet()): List<KeywordMatch> {
        if (text.isBlank()) return emptyList()
        val lower = text.lowercase()
        val matches = mutableListOf<KeywordMatch>()

        for (kw in extraKeywords) {
            val k = kw.trim().lowercase()
            if (k.isNotEmpty() && lower.contains(k)) {
                matches.add(
                    KeywordMatch(
                        category = "custom",
                        categoryLabel = "Custom keyword",
                        keyword = kw.trim(),
                        snippet = text.take(MAX_SNIPPET),
                    ),
                )
                break
            }
        }

        for ((category, keywords) in ALL_KEYWORDS) {
            for (kw in keywords) {
                if (lower.contains(kw)) {
                    matches.add(
                        KeywordMatch(
                            category = category,
                            categoryLabel = CATEGORY_LABELS[category] ?: category,
                            keyword = kw,
                            snippet = text.take(MAX_SNIPPET),
                        ),
                    )
                    break // one match per category is enough
                }
            }
        }

        return matches
    }

    /**
     * Format a content item for the backend — suitable for
     * MoniiRepository.reportContent().
     */
    fun formatForBackend(
        sourceApp: String,
        body: String,
        match: KeywordMatch,
        counterparty: String? = null,
    ): Map<String, Any?> = mapOf(
        "source" to "keyword",
        "counterparty" to counterparty,
        "body" to body.take(MAX_SNIPPET),
        "matched" to match.categoryLabel,
        "occurredAt" to java.time.Instant.now().toString(),
    )
}

data class KeywordMatch(
    val category: String,
    val categoryLabel: String,
    val keyword: String,
    val snippet: String,
)
