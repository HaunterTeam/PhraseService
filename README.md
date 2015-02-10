# PhraseService

The PhraseService is a REST web service hosted on [https://restinphraseservice.herokuapp.com/](https://restinphraseservice.herokuapp.com/). It allows only GET requests with no token.

The goal of this service is to provide motivational quotes based on:

* The `bmilvl` which is the actual bmi of the user.
* The `change` which is the difference between the actual bmilvl and the old bmilvl
* The weather conditions `wt1`,`wt2` and `wt3` for the next three days.

An example of request is the following.
```
GET https://restinphraseservice.herokuapp.com/phrase-service/phrase?bmilvl=<bmilvl>&change=<change>&wt1=<wt1>&wt2=<wt2>&wt3=<wt3>
```
The response output for the above request if the following.
```
[{"idphrase":1,"phrase":"You fatted a bit. Go ahead and eat a lot of","weathertype":1,"bmirange":1,"change":1,"activity":"Eat and lie down."},{"idphrase":1,"phrase":"You fatted a bit. Go ahead and eat a lot of","weathertype":1,"bmirange":1,"change":1,"activity":"Eat and lie down."},{"idphrase":1,"phrase":"You fatted a bit. Go ahead and eat a lot of","weathertype":1,"bmirange":1,"change":1,"activity":"Eat and lie down."}]
```

Contributors: [Luca Zamboni](https://github.com/luca-zamboni) 100%