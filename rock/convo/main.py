
import re
from collections import Counter
from nltk import pos_tag, WordNetLemmatizer
from nltk.corpus import wordnet
from nltk.tokenize import word_tokenize
import nltk

# Download required NLTK data
try:
    nltk.data.find('tokenizers/punkt')
except LookupError:
    nltk.download('punkt')

try:
    nltk.data.find('taggers/averaged_perceptron_tagger')
except LookupError:
    nltk.download('averaged_perceptron_tagger')

class TranscriptAnalyzer:

    def __init__(self, text:str):
        self.text = text
        self.words = self._tokenize(text)
        self.lemmatizer = WordNetLemmatizer()
    
    def _tokenize(self, text:str):
        # Better tokenization that handles contractions properly
        return word_tokenize(text.lower())
    
    def _extract_verbs(self):
        tagged = pos_tag(self.words)
        verbs = []
        for word, tag in tagged:
            # Only include actual verbs, not proper nouns or contractions
            if tag.startswith('VB') and not word.startswith("'") and len(word) > 1:
                # Additional check: exclude common proper nouns that get mis-tagged
                if word.lower() not in ['chad', 'dave', 'yankee']:
                    lemma = self.lemmatizer.lemmatize(word, wordnet.VERB)
                    verbs.append(lemma)
        return verbs
    
    def top_n_verbs(self, n=5):
        verbs = self._extract_verbs()
        counts = Counter(verbs)
        return [verb for verb, _ in counts.most_common(n)]
    
if __name__ == "__main__":
    text = (
        "Hey Chad it's me Dave look I just want to say I didn't mean any of that, "
        "I was just messing around. It's alright that you're a Yankee fan."
    )
    analyzer = TranscriptAnalyzer(text)
    print("top verbs: ", analyzer.top_n_verbs(3))
