# PhraseService

The PhraseService is a REST web service hosted on [https://restinphraseservice.herokuapp.com/](https://restinphraseservice.herokuapp.com/). It allows only GET requests with no token. An example of request is the following.
```
GET https://restinphraseservice.herokuapp.com/phrase-service/phrase?bmilvl=<bmilvl>&change=<change>&wt1=<wt1>&wt2=<wt2>&wt3=<wt3>
```
The response output for the above request if the following.
```
[{"idphrase":1,"phrase":"You fatted a bit. Go ahead and eat a lot of","weathertype":1,"bmirange":1,"change":1,"activity":"Eat and lie down."},{"idphrase":1,"phrase":"You fatted a bit. Go ahead and eat a lot of","weathertype":1,"bmirange":1,"change":1,"activity":"Eat and lie down."},{"idphrase":1,"phrase":"You fatted a bit. Go ahead and eat a lot of","weathertype":1,"bmirange":1,"change":1,"activity":"Eat and lie down."}]
```