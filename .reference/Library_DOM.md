<!--ChildNode-->
<!--ParentNode-->
<!--XMLDocument-->
<!--DOMError-->
<!--DOMString-->
<!--# DOMTimeStamp-->
<!--DOMSettableTokenList-->
<!--HTMLAppletElement-->
<!--HTMLDirectoryElement-->
<!--HTMLFrameElement-->
# XMLHttpRequest⭐
`Herança: XMLHttpRequestEventTarget, EventTarget`
`Construtor`
XMLHttpRequest()
`Propriedades de instância`
channel⚠️
mozAnon⚠️
mozBackgroundRequest⚠️
mozSystem⚠️
readyState
response
responseText
responseType
responseURL
responseXML
status
statusText
timeout
upload
withCredentials
`Métodos de instância`
abort()
getAllResponseHeaders()
getResponseHeader()
open()
overrideMimeType()
send()
setAttributionReporting()⚠️
setRequestHeader()
`Eventos`
abort
error
load
loadend
loadstart
progress
readystatechange
timeout

# Eventos Geral⭐
> Document
afterscriptexecute⚠️
beforescriptexecute⚠️
copy
cut
DOMContentLoaded
fullscreenchange
fullscreenerror
paste
pointerlockchange
pointerlockerror
prerenderingchange⚠️
readystatechange
scroll
scrollend
securitypolicyviolation
selectionchange
visibilitychange

> Element
afterscriptexecute⚠️
animationcancel
animationend
animationiteration
animationstart
auxclick
beforeinput
beforematch⚠️
beforescriptexecute⚠️
beforexrselect⚠️
blur
click
compositionend
compositionstart
compositionupdate
contentvisibilityautostatechange
contextmenu
copy
cut
dblclick
<!--DOMActivate-->
<!--DOMMouseScroll-->
focus
focusin
focusout
fullscreenchange
fullscreenerror
<!--gesturechange-->
<!--gestureend-->
<!--gesturestart-->
gotpointercapture
input
keydown
<!--keypress-->
keyup
lostpointercapture
mousedown
mouseenter
mouseleave
mousemove
mouseout
mouseover
mouseup
<!--mousewheel-->
<!--MozMousePixelScroll-->
paste
pointercancel
pointerdown
pointerenter
pointerleave
pointermove
pointerout
pointerover
pointerrawupdate⚠️
pointerup
scroll
scrollend
securitypolicyviolation
touchcancel
touchend
touchmove
touchstart
transitioncancel
transitionend
transitionrun
transitionstart
webkitmouseforcechanged⚠️
webkitmouseforcedown⚠️
webkitmouseforceup⚠️
webkitmouseforcewillbegin⚠️
wheel

> Node
selectstart

> Windown 
afterprint
appinstalled
beforeinstallprompt
beforeprint
beforeunload
blur
copy
cut
devicemotion
deviceorientation
deviceorientationabsolute
error
focus
gamepadconnected
gamepaddisconnected
hashchange
languagechange
load
message
messageerror
offline
online
<!--orientationchange-->
pagehide
pagereveal⚠️
pageshow
pageswap⚠️
paste
popstate
rejectionhandled
resize
storage
unhandledrejection
<!--unload-->
<!--vrdisplayactivate-->
<!--vrdisplayconnect-->
<!--vrdisplaydeactivate-->
<!--vrdisplaydisconnect-->
<!--vrdisplaypresentchange-->
# Attr
`Herança: Node, EventTarget`
localName
name
namespaceURI
ownerElement
prefix
<!--specified-->
value
# CharacterData
`Herança: Node, EventTarget`
`Propriedades de instância`
data
length
nextElementSibling
previousElementSibling
`Métodos de instância`
after()
appendData()
before()
deleteData()
insertData()
remove()
replaceData()
replaceWith()
substringData()
# Comment
`Herança: CharacterData, Node, EventTarget`
`Construtor`
Comment()
# CustomEvent
`Herança: Event`
`Construtor`
CustomEvent()
`Propriedades da instância`
detail
# Document⭐
`Herança: Node, EventTarget`
`Construtor`
Document()
`Propriedades de instância`
activeElement
adoptedStyleSheets
alinkColor
<!--all-->
anchors
<!--applets-->
bgColor
body
characterSet
childElementCount
children
compatMode
contentType
cookie
currentScript
defaultView
designMode
dir
doctype
documentElement
documentURI
<!--domain-->
embeds
featurePolicy⚠️
<!--fgColor--> 
firstElementChild
fonts
forms
fragmentDirective
fullscreen
fullscreenElement
fullscreenEnabled
head
hidden
images
implementation
lastElementChild
lastModified
<!--lastStyleSheetSet-->
<!--linkColor-->
links
location
pictureInPictureElement
pictureInPictureEnabled
plugins
pointerLockElement
<!--preferredStyleSheetSet-->
prerendering⚠️
readyState
referrer
<!--rootElement-->
scripts
scrollingElement
<!--selectedStyleSheetSet-->
styleSheets
<!--styleSheetSets-->
timeline
title
URL
visibilityState
<!--vlinkColor-->
<!--xmlEncoding-->
<!--xmlVersion-->
`Métodos estáticos`
parseHTMLUnsafe()
Métodos de instância
adoptNode()
append()
browsingTopics()⚠️
caretPositionFromPoint()
caretRangeFromPoint()⚠️
<!--clear()-->
close()
createAttribute()
createAttributeNS()
createCDATASection()
createComment()
createDocumentFragment()
createElement()
createElementNS()
createEvent()
createExpression()
createNodeIterator()
<!--createNSResolver()-->
createProcessingInstruction()
createRange()
createTextNode()
<!--createTouch()-->
<!--createTouchList()-->
createTreeWalker()
elementFromPoint()
elementsFromPoint()
<!--enableStyleSheetsForSet()-->
evaluate()
execCommand()
exitFullscreen()
exitPictureInPicture()
exitPointerLock()
getAnimations()
getElementById()
getElementsByClassName()
getElementsByName()
getElementsByTagName()
getElementsByTagNameNS()
getSelection()
hasFocus()
hasStorageAccess()
hasUnpartitionedCookieAccess()
importNode()
<!--mozSetImageElement()-->
open()
prepend()
<!--queryCommandEnabled()-->
<!--queryCommandState()-->
<!--queryCommandSupported()-->
querySelector()
querySelectorAll()
releaseCapture()⚠️
replaceChildren()
requestStorageAccess()
requestStorageAccessFor()⚠️
startViewTransition()
write()
writeln()
# DocumentFragment
`Herança: Node, EventTarget`
`Construtor`
DocumentFragment()
`Propriedades de instância`
childElementCount
children
firstElementChild
lastElementChild
`Métodos de instância`
append()
getElementById()
prepend()
querySelector()
querySelectorAll()
replaceChildren()
# DocumentType
`Herança: Node, EventTarget`
`Instance properties`
name
publicId
systemId
`Instance methods`
after()
before()
remove()
replaceWith()
# DOMException
`Construtor`
DOMException()
`Propriedades da instância`
codeObsoleto
message
name
# DOMImplementation
`Instance methods`
createDocument()
createDocumentType()
createHTMLDocument()
<!--hasFeature()-->
# DOMStringList
`Propriedades de instância`
length
`Métodos de instância`
contains()
item()
# DOMTokenList
`Instance properties`
length
value
`Instance methods`
add()
contains()
entries()
forEach()
item()
keys()
remove()
replace()
supports()
toggle()
values()
# Element⭐
`Herança: Node, EventTarget`
`Instance properties`
ariaAtomic
ariaAutoComplete
ariaBrailleLabel
ariaBrailleRoleDescription
ariaBusy
ariaChecked
ariaColCount
ariaColIndex
ariaColIndexText
ariaColSpan
ariaCurrent
ariaDescription
ariaDisabled
ariaExpanded
ariaHasPopup
ariaHidden
ariaKeyShortcuts
ariaLabel
ariaLevel
ariaLive
ariaModal
ariaMultiLine
ariaMultiSelectable
ariaOrientation
ariaPlaceholder
ariaPosInSet
ariaPressed
ariaReadOnly
ariaRelevant⚠️
ariaRequired
ariaRoleDescription
ariaRowCount
ariaRowIndex
ariaRowIndexText
ariaRowSpan
ariaSelected
ariaSetSize
ariaSort
ariaValueMax
ariaValueMin
ariaValueNow
ariaValueText
assignedSlot
attributes
childElementCount
children
classList
className
clientHeight
clientLeft
clientTop
clientWidth
currentCSSZoom
elementTiming⚠️
firstElementChild
id
innerHTML
lastElementChild
localName
namespaceURI
nextElementSibling
outerHTML
part
prefix
previousElementSibling
scrollHeight
scrollLeft
scrollLeftMax⚠️
scrollTop
scrollTopMax⚠️
scrollWidth
shadowRoot
slot
tagName
`Instance methods`
after()
animate()
append()
attachShadow()
before()
checkVisibility()
closest()
computedStyleMap()
getAnimations()
getAttribute()
getAttributeNames()
getAttributeNode()
getAttributeNodeNS()
getAttributeNS()
getBoundingClientRect()
getClientRects()
getElementsByClassName()
getElementsByTagName()
getElementsByTagNameNS()
getHTML()
hasAttribute()
hasAttributeNS()
hasAttributes()
hasPointerCapture()
insertAdjacentElement()
insertAdjacentHTML()
insertAdjacentText()
matches()
prepend()
querySelector()
querySelectorAll()
releasePointerCapture()
remove()
removeAttribute()
removeAttributeNode()
removeAttributeNS()
replaceChildren()
replaceWith()
requestFullscreen()
requestPointerLock()
scroll()
scrollBy()
scrollIntoView()
scrollIntoViewIfNeeded()⚠️
scrollTo()
setAttribute()
setAttributeNode()
setAttributeNodeNS()
setAttributeNS()
<!--setCapture()-->
setHTMLUnsafe()
setPointerCapture()
toggleAttribute()
# Event⭐
`Construtor`
Event()
`Propriedades de instância`
bubbles
cancelable
<!--cancelBubble-->
composed
currentTarget
defaultPrevented
eventPhase
explicitOriginalTarget⚠️
isTrusted
originalTarget⚠️
<!--returnValue-->
srcElement
target
timeStamp
type
`Métodos de instância`
composedPath()
initEvent()
preventDefault()
stopImmediatePropagation()
stopPropagation()
# EventTarget⭐
`Construtor`
EventTarget()
`Métodos de instância`
addEventListener()
dispatchEvent()
removeEventListener()
# HTMLCollection
`Propriedades de instância`
length
`Métodos de instância`
item()
namedItem()
# MutationObserver
`Construtor`
MutationObserver()
`Métodos de instância`
disconnect()
observe()
takeRecords()
# MutationRecord
`Instance properties`
addedNodes
attributeName
attributeNamespace
nextSibling
oldValue
previousSibling
removedNodes
target
type
# Node⭐
`Herança: EventTarget`
`Propriedades de instância`
baseURI
childNodes
firstChild
isConnected
lastChild
nextSibling
nodeName
nodeType
nodeValue
ownerDocument
parentElement
parentNode
previousSibling
textContent
`Métodos de instância`
appendChild()
cloneNode()
compareDocumentPosition()
contains()
getRootNode()
hasChildNodes()
insertBefore()
isDefaultNamespace()
isEqualNode()
isSameNode()
lookupNamespaceURI()
lookupPrefix()
normalize()
removeChild()
replaceChild()
# NodeFilter
`Methods`
NodeFilter.acceptNode()
# NodeIterator
`Instance properties`
filter
pointerBeforeReferenceNode
referenceNode
root
whatToShow
`Instance methods`
<!--detach()-->
nextNode()
previousNode()
# NodeList
`Propriedades de instância`
length
`Métodos de instância`
entries()
forEach()
item()
keys()
values()
# ProcessingInstruction
`Herança: CharacterData, Node, EventTarget`
`Propriedades de instância`
sheet
target
# Range
`Herança: AbstractRange`
`Constructor`
Range()
`Instance properties`
collapsed
commonAncestorContainer
endContainer
endOffset
startContainer
startOffset
`Instance methods`
cloneContents()
cloneRange()
collapse()
compareBoundaryPoints()
<!--compareNode()-->
comparePoint()
createContextualFragment()
deleteContents()
detach()
extractContents()
getBoundingClientRect()
getClientRects()
insertNode()
intersectsNode()
isPointInRange()
selectNode()
selectNodeContents()
setEnd()
setEndAfter()
setEndBefore()
setStart()
setStartAfter()
setStartBefore()
surroundContents()
toString()
# Text
`Herança: CharacterData, Node, EventTarget`
`Construtor`
Text()
`Propriedades da instância`
assignedSlot
wholeText
`Métodos de instância`
splitText()
# TreeWalker
`Instance properties`
currentNode
filter
root
whatToShow
`Instance methods`
firstChild()
lastChild()
nextNode()
nextSibling()
parentNode()
previousNode()
previousSibling()
# URL
`Construtor`
URL()
`Propriedades de instância`
hash
host
hostname
href
origin
password
pathname
port
protocol
search
searchParams
username
`Métodos estáticos`
canParse()
createObjectURL()
parse()
revokeObjectURL()
`Métodos de instância`
toJSON()
toString()
# Window⭐
`Herança: EventTarget`
`Propriedades de instância`
caches
closed
console
cookieStore⚠️
credentialless⚠️
crossOriginIsolated
crypto
customElements
devicePixelRatio
document
documentPictureInPicture⚠️
event
<!--external-->
fence⚠️
frameElement
frames
fullScreen
history
indexedDB
innerHeight
innerWidth
isSecureContext
launchQueue⚠️
length
localStorage
location
locationbar
menubar
mozInnerScreenX⚠️
mozInnerScreenY⚠️
name
navigation⚠️
navigator
opener
<!--orientation-->
origin
originAgentCluster⚠️
outerHeight
outerWidth
parent
performance
personalbar
scheduler
screen
screenLeft
screenTop
screenX
screenY
scrollbars
scrollMaxX⚠️
scrollMaxY⚠️
scrollX
scrollY
self
sessionStorage
sharedStorage⚠️
speechSynthesis
<!--status-->
statusbar
toolbar
top
trustedTypes
visualViewport
window
`Métodos de instância`
alert()
atob()
<!--back()-->
<!--blur()-->
btoa()
cancelAnimationFrame()
cancelIdleCallback()
<!--captureEvents()-->
<!--clearImmediate()-->
close()
confirm()
dump()⚠️
fetch()
find()⚠️
focus()
<!--forward()-->
getComputedStyle()
getDefaultComputedStyle()⚠️
getScreenDetails()⚠️
getSelection()
matchMedia()
moveBy()
moveTo()
open()
postMessage()
print()
prompt()
queryLocalFonts()⚠️
<!--releaseEvents()-->
requestAnimationFrame()
<!--requestFileSystem()-->
requestIdleCallback()
resizeBy()
resizeTo()
scroll()
scrollBy()
<!--scrollByLines()-->
scrollByPages()
scrollTo()
setImmediate()
<!--setResizable()-->
showDirectoryPicker()⚠️
<!--showModalDialog()-->
showOpenFilePicker()⚠️
showSaveFilePicker()⚠️
sizeToContent()⚠️
stop()
updateCommands()⚠️
<!--webkitConvertPointFromNodeToPage()-->
<!--webkitConvertPointFromPageToNode()-->


# Worker
`Herança: EventTarget`
`Construtor`
Worker()
`Métodos de instância`
postMessage()
terminate()
`Eventos`
error
message
messageerror

# HTMLAnchorElement
# HTMLAreaElement
# HTMLAudioElement
# HTMLBaseElement
# HTMLBodyElement
# HTMLBRElement
# HTMLButtonElement
# HTMLCanvasElement
# HTMLDataElement
# HTMLDataListElement
# HTMLDialogElement
# HTMLDivElement
# HTMLDListElement
# HTMLElement
# HTMLEmbedElement
# HTMLFieldSetElement
# HTMLFontElement
# HTMLFormElement
# HTMLFrameSetElement
# HTMLHeadElement
# HTMLHeadingElement
# HTMLHtmlElement
# HTMLHRElement
# HTMLIFrameElement
# HTMLImageElement
# HTMLInputElement
# HTMLLabelElement
# HTMLLegendElement
# HTMLLIElement
# HTMLLinkElement
# HTMLMapElement
# HTMLMediaElement
# HTMLMenuElement
# HTMLMetaElement
# HTMLMeterElement
# HTMLModElement
# HTMLObjectElement
# HTMLOListElement
# HTMLOptGroupElement
# HTMLOptionElement
# HTMLOutputElement
# HTMLParagraphElement
# HTMLParamElement
# HTMLPreElement
# HTMLProgressElement
# HTMLQuoteElement
# HTMLScriptElement
# HTMLSelectElement
# HTMLSourceElement
# HTMLSpanElement
# HTMLStyleElement
# HTMLTableElement
# HTMLTableCaptionElement
# HTMLTableCellElement
# HTMLTableDataCellElement
# HTMLTableHeaderCellElement
# HTMLTableColElement
# HTMLTableRowElement
# HTMLTableSectionElement
# HTMLTextAreaElement
# HTMLTimeElement
# HTMLTitleElement
# HTMLTrackElement
# HTMLUListElement
# HTMLUnknownElement
# HTMLVideoElement