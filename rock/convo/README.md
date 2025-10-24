Write a Python function that takes a transcript of a conversation (as a string or list of sentences), finds the n-most common “action verbs” used by a speaker, and returns them sorted by frequency.

For example, if the transcript is something like:

```
“We will schedule the appointment tomorrow. Please bring the form. We need to follow up next week. You must complete the form by Tuesday. Let me know when you receive the form.”
```

and n = 2, your function might output:

```
["bring", "follow"]
```

(assuming those are the top two action verbs in that text after filtering common verbs like “do”, “make”, etc.)
