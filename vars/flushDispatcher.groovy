def call(def URL_DISPATCHER) {
 bat "curl -H 'CQ-Action: Delete' -H 'CQ-Handle: /' -H 'CQ-Path:/' -H 'Content-Length: 0' -H 'Content-Type: application/octet-stream' ${URL_DISPATCHER}/dispatcher/invalidate.cache"
}


