(function(e){"forEach"in Array.prototype||(Array.prototype.forEach=function(t){if(this===e||null===this)throw new TypeError(this+" is not an object");if("function"!=typeof t)throw new TypeError(t+" is not a function");for(var n=Object(this),o=arguments[1],r=n instanceof String?n.split(""):n,i=Math.max(Math.min(r.length,9007199254740991),0)||0,c=-1;++c<i;)c in r&&t.call(o,r[c],c,n)}),"defineProperty"in Object&&function(){try{return Object.defineProperty({},"test",{value:42}),!0}catch(e){return!1}}()||function(e){var t=Object.prototype.hasOwnProperty("__defineGetter__"),n="A property cannot both have accessors and be writable or have a value";Object.defineProperty=function(o,r,i){if(e&&(o===window||o===document||o===Element.prototype||o instanceof Element))return e(o,r,i);if(null===o||!(o instanceof Object||"object"==typeof o))throw new TypeError("Object.defineProperty called on non-object");if(!(i instanceof Object))throw new TypeError("Property description must be an object");var c=String(r),a="value"in i||"writable"in i,u="get"in i&&typeof i.get,s="set"in i&&typeof i.set;if(u){if("function"!==u)throw new TypeError("Getter must be a function");if(!t)throw new TypeError("Getters & setters cannot be defined on this javascript engine");if(a)throw new TypeError(n);o.__defineGetter__(c,i.get)}else o[c]=i.value;if(s){if("function"!==s)throw new TypeError("Setter must be a function");if(!t)throw new TypeError("Getters & setters cannot be defined on this javascript engine");if(a)throw new TypeError(n);o.__defineSetter__(c,i.set)}return"value"in i&&(o[c]=i.value),o}}(Object.defineProperty);var t=function(){function e(e){if(/^-?[_a-zA-Z]+[_a-zA-Z0-9-]*$/.test(e))return String(e);throw new Error("InvalidCharacterError: DOM Exception 5")}function t(e){for(var t,n=-1,o={};t=e[++n];)o[t]=!0;return o}function n(e,t){var n,o=[];for(n in t)t[n]&&o.push(n);[].splice.apply(e,[0,e.length].concat(o))}var o=function(){};return o.prototype={constructor:o,item:function(e){return this[parseFloat(e)]||null},length:Array.prototype.length,toString:function(){return[].join.call(this," ")},add:function(){for(var o=t(this),r=0;r in arguments;++r)o[e(arguments[r])]=!0;n(this,o)},contains:function(e){return e in t(this)},remove:function(){for(var o=t(this),r=0;r in arguments;++r)o[e(arguments[r])]=!1;n(this,o)},toggle:function(o){var r=t(this),i=1 in arguments?!arguments[1]:e(o)in r;return r[o]=!i,n(this,r),!i}},o}();"Document"in this||(this.HTMLDocument?this.Document=this.HTMLDocument:(this.Document=this.HTMLDocument=document.constructor=new Function("return function Document() {}")(),this.Document.prototype=document)),"Element"in this&&"HTMLElement"in this||function(){function e(){return s--||clearTimeout(t),!(!document.body||document.body.prototype||!/(complete|interactive)/.test(document.readyState))&&(c(document,!0),t&&document.body.prototype&&clearTimeout(t),!!document.body.prototype)}if(!window.Element||window.HTMLElement){window.Element=window.HTMLElement=new Function("return function Element() {}")();var t,n=document.appendChild(document.createElement("body")),o=n.appendChild(document.createElement("iframe")).contentWindow.document,r=Element.prototype=o.appendChild(o.createElement("*")),i={},c=function(e,t){var n,o,r,a=e.childNodes||[],u=-1;if(1===e.nodeType&&e.constructor!==Element){e.constructor=Element;for(n in i)o=i[n],e[n]=o}for(;r=t&&a[++u];)c(r,t);return e},a=document.getElementsByTagName("*"),u=document.createElement,s=100;r.attachEvent("onpropertychange",function(e){for(var t,n=e.propertyName,o=!i.hasOwnProperty(n),c=r[n],u=i[n],s=-1;t=a[++s];)1===t.nodeType&&(o||t[n]===u)&&(t[n]=c);i[n]=c}),r.constructor=Element,r.hasAttribute||(r.hasAttribute=function(e){return null!==this.getAttribute(e)}),e()||(document.onreadystatechange=e,t=setInterval(e,25)),document.createElement=function(e){var t=u(String(e).toLowerCase());return c(t)},document.removeChild(n)}else window.HTMLElement=window.Element}(),"document"in this&&"classList"in document.documentElement||Object.defineProperty(Element.prototype,"classList",{configurable:!0,get:function(){function e(){var e="object"==typeof r.className?r.className.baseVal:r.className;[].splice.apply(o,[0,o.length].concat((e||"").replace(/^\s+|\s+$/g,"").split(/\s+/)))}function n(){r.attachEvent&&r.detachEvent("onpropertychange",e),"object"==typeof r.className?r.className.baseVal=i.toString.call(o):r.className=i.toString.call(o),r.attachEvent&&r.attachEvent("onpropertychange",e)}var o,r=this,i=t.prototype,c=function(){};return c.prototype=new t,c.prototype.item=function(t){return e(),i.item.apply(o,arguments)},c.prototype.toString=function(){return e(),i.toString.apply(o,arguments)},c.prototype.add=function(){return e(),i.add.apply(o,arguments),n()},c.prototype.contains=function(t){return e(),i.contains.apply(o,arguments)},c.prototype.remove=function(){return e(),i.remove.apply(o,arguments),n()},c.prototype.toggle=function(t){return e(),t=i.toggle.apply(o,arguments),n(),t},o=new c,r.attachEvent&&r.attachEvent("onpropertychange",e),o}}),"Window"in this||function(e){e.constructor?e.Window=e.constructor:(e.Window=e.constructor=new Function("return function Window() {}")()).prototype=this}(this),function(e){if(!("Event"in e))return!1;if("function"==typeof e.Event)return!0;try{return new Event("click"),!0}catch(t){return!1}}(this)||function(){function t(e,t){for(var n=-1,o=e.length;++n<o;)if(n in e&&e[n]===t)return n;return-1}var n={click:1,dblclick:1,keyup:1,keypress:1,keydown:1,mousedown:1,mouseup:1,mousemove:1,mouseover:1,mouseenter:1,mouseleave:1,mouseout:1,storage:1,storagecommit:1,textinput:1};if("undefined"!=typeof document&&"undefined"!=typeof window){var o=window.Event&&window.Event.prototype||null;window.Event=Window.prototype.Event=function(t,n){if(!t)throw new Error("Not enough arguments");var o;if("createEvent"in document){o=document.createEvent("Event");var r=!(!n||n.bubbles===e)&&n.bubbles,i=!(!n||n.cancelable===e)&&n.cancelable;return o.initEvent(t,r,i),o}return o=document.createEventObject(),o.type=t,o.bubbles=!(!n||n.bubbles===e)&&n.bubbles,o.cancelable=!(!n||n.cancelable===e)&&n.cancelable,o},o&&Object.defineProperty(window.Event,"prototype",{configurable:!1,enumerable:!1,writable:!0,value:o}),"createEvent"in document||(window.addEventListener=Window.prototype.addEventListener=Document.prototype.addEventListener=Element.prototype.addEventListener=function(){var e=this,o=arguments[0],r=arguments[1];if(e===window&&o in n)throw new Error("In IE8 the event: "+o+" is not available on the window object. Please see https://github.com/Financial-Times/polyfill-service/issues/317 for more information.");e._events||(e._events={}),e._events[o]||(e._events[o]=function(n){var o,r=e._events[n.type].list,i=r.slice(),c=-1,a=i.length;for(n.preventDefault=function(){!1!==n.cancelable&&(n.returnValue=!1)},n.stopPropagation=function(){n.cancelBubble=!0},n.stopImmediatePropagation=function(){n.cancelBubble=!0,n.cancelImmediate=!0},n.currentTarget=e,n.relatedTarget=n.fromElement||null,n.target=n.target||n.srcElement||e,n.timeStamp=(new Date).getTime(),n.clientX&&(n.pageX=n.clientX+document.documentElement.scrollLeft,n.pageY=n.clientY+document.documentElement.scrollTop);++c<a&&!n.cancelImmediate;)c in i&&-1!==t(r,o=i[c])&&"function"==typeof o&&o.call(e,n)},e._events[o].list=[],e.attachEvent&&e.attachEvent("on"+o,e._events[o])),e._events[o].list.push(r)},window.removeEventListener=Window.prototype.removeEventListener=Document.prototype.removeEventListener=Element.prototype.removeEventListener=function(){var e,n=arguments[0],o=arguments[1];this._events&&this._events[n]&&this._events[n].list&&-1!==(e=t(this._events[n].list,o))&&(this._events[n].list.splice(e,1),this._events[n].list.length||(this.detachEvent&&this.detachEvent("on"+n,this._events[n]),delete this._events[n]))},window.dispatchEvent=Window.prototype.dispatchEvent=Document.prototype.dispatchEvent=Element.prototype.dispatchEvent=function(e){if(!arguments.length)throw new Error("Not enough arguments");if(!e||"string"!=typeof e.type)throw new Error("DOM Events Exception 0");var t=this,n=e.type;try{if(!e.bubbles){e.cancelBubble=!0;var o=function(e){e.cancelBubble=!0,(t||window).detachEvent("on"+n,o)};this.attachEvent("on"+n,o)}this.fireEvent("on"+n,e)}catch(r){e.target=t;do{e.currentTarget=t,"_events"in t&&"function"==typeof t._events[n]&&t._events[n].call(t,e),"function"==typeof t["on"+n]&&t["on"+n].call(t,e),t=9===t.nodeType?t.parentWindow:t.parentNode}while(t&&!e.cancelBubble)}return!0},document.attachEvent("onreadystatechange",function(){"complete"===document.readyState&&document.dispatchEvent(new Event("DOMContentLoaded",{bubbles:!0}))}))}}()}).call("object"==typeof window&&window||"object"==typeof self&&self||"object"==typeof global&&global||{}),function(doc,win){var $=function(e,t){return(t||doc).querySelector(e)},$$=function(e,t){return makeArray((t||doc).querySelectorAll(e))},makeArray=function(e){var t,n,o=[];for(t=0,n=e.length;t<n;t++)o[t]=e[t];return o.length=n,o};!function(){var e=function(){n()},t=function(e){var t=win.innerHeight||doc.documentElement.clientHeight||doc.body.clientHeight;return e.getBoundingClientRect().top-t-50<=0},n=function(){var e=$$("img[lazy-src]"),n=$$(".lazy");e.forEach(function(e){t(e)&&(e.src=e.getAttribute("lazy-src"),e.removeAttribute("lazy-src"))}),n.forEach(function(e){t(e)&&e.classList.remove("lazy")})};e(),win.addEventListener("scroll",e,!1)}(),function(e){if(e){var t,n=$(".tb-nav",e);n&&(n.addEventListener("mouseenter",function(){t=setTimeout(function(){!function(e){$$("img[data-src]",e).forEach(function(e){e.src=e.getAttribute("data-src"),e.removeAttribute("data-src")})}($(".tb-box",n)),n.classList.add("cur")},150)},!1),n.addEventListener("mouseleave",function(){clearTimeout(t),n.classList.remove("cur")},!1))}}($(".top-bar")),function(e){if(e){var t=$$(".cn-hd span",e),n=$$(".cn-panel",e),o=function(){var e={};return function(t,n){e[n]||(r(t),e[n]=!0)}}(),r=function(e){$$("img[data-src]",e).forEach(function(e){e.src=e.getAttribute("data-src"),e.removeAttribute("data-src")})};t.forEach(function(e,r){var i;e.addEventListener("mouseenter",function(){i=setTimeout(function(){!function(e){t.forEach(function(t,n){var o=t.classList;e===n?o.add("cur"):o.remove("cur")}),n.forEach(function(t,n){var r=t.classList;e===n?(o(t,n),r.remove("hidden")):r.add("hidden")})}(r)},150)},!1),e.addEventListener("mouseleave",function(){clearTimeout(i)},!1)})}}($(".category-nav")),function(e){e.length&&e.forEach(function(e){var t=$$("li",e),n=function(){var e={};return function(t,n){e[n]||(e[n]=!0,o(t))}}(),o=function(e){$$("img[data-src]",e).forEach(function(e){e.src=e.getAttribute("data-src"),e.removeAttribute("data-src")})};t.forEach(function(e,o){var r;e.addEventListener("mouseenter",function(){r=setTimeout(function(){!function(e){t.forEach(function(t,o){var r=t.classList;e===o?(r.add("cur"),n(t,o)):r.remove("cur")})}(o)},150)},!1),e.addEventListener("mouseleave",function(){clearTimeout(r)},!1)})})}($$(".pn-list"));var PopupImage=function(){var PopupImage={},element,slot,create=function(){var e,t=doc.createElement("div"),n=[];return t.innerHTML=['<div style="position:fixed;left:0;top:0;right:0;bottom:0;z-index:9999;display:none;">','\t<div style="position:absolute;top:20px;right:20px;width:48px;height:48px;cursor:pointer;z-index:2;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAFB0lEQVRoQ71aTXLdRBDufnsqzgmADSuqcFYsk9YFkpyAcAP7BMQnSDgByQlwLqC2l6xwqlixIZwAKPavqU+05NG8Gc1o9J5nZdeTZvrrn69/RkxHWKp6ZmZPmfmciJ4R0RkR4e9w3RHR30R0Y2Z3zHwrIvh/0+Itb/d9/5yZXxHRi8Z9rs3sXdd1HxrfpyYAqvodEb0moi9aD47e+4T9ROT92v1WAVBVuMebhHtM55rZR7gKM48ug9/OzWxwK2Z+tCAk3rkUkZtaINUAVPUH1/psbzP7k5mviei65mBVhdWgCLjd84ygsMZVDYgiAAQoEf3sh4aavmVmHFStrVggB/PKzC4SlsG+L0uBvgjAhdfQZczsHwSuiEDrR1l+zlsiQmzFzCVLILIAMsJ/ZOZnJa20okKMmdl1ZA3ERRZEEkBKeCJ6LyKgzJMuzyk3zPxNcFAWRA4AfH7idjBL13VxYjoZkAwIkMTL+NADAKp64VQ5PAvhT+k2OS1kQIBiESvTmgFwVvjVSwEIj4A9FxEkmgdfkMfLjjF3oPR4EsoTA5i5jtPY0dimRQOqCleGXOOaudIEwLMsKHN0nduu65BwkktVERPYGFyNIFu9avfo+x5B/TQ4AFYYzgwBvIt4+Muc6/jBAIskB7OC5laBWLOHu/YfAYCJEQcASw+k1JrQyCoQkfC1Focrh6XHY+SjEcCMeVyj2RIhwxBVIDLCF5kuEQsDIw0AQo2iOOu6rlgmt4BoFX70gr7vPzHz5/jfzIYYHS1gKf8qReUaEFuFd1efxamIMMfss5Y6a0AcQ3gHgFLmp0CxAgCx/08UVbLA+PsSCH9mZKwxYIs+nzrbFYFEO65LAEBriGZlWDBLreDhcxkQ//ozn43Pbi1NVDV09ysAmNFTKwA3MaYTcSU54dwqvJ8xi1eOGGhz1QlL7Pf7X3a73Vehhfb7/e+73e7brb1E3/cYyQylNphoBgBZVUQet7hQEA9o4JFDHjHfe6MXhmiGVmXsWJbQhQYAR3Yh1EdTwJoZhSBay44o1uYuFAcxEQ0peq0VMlT5G/Zh5q+D/aoydoaFUHv9Ffw2BPGqMmKB3pJU6b4aB3YTiETOGmgUJfNURhPRlYiAWqtWTZKqSXY1hyW85X/Oj7j1TkSeVG4483nXdjJJHQOEqiKJTb35UErg0ER5nO0FQrYJA3ZJ+OCdVJ6ocqe45I+LuTgOFt2oxm1yFmy1RMJ97svpREMDrcAKSTZS1VlRtTbDZkD8KCJQ5MHyORU6MrDQuO4bGo+DuKUsWWEAsVb4jDstDs0S2p+3lA4AwRFWegcjjFg13iXdtOQNPxMavVhivXjU4zJMMRqPVeK+E8JJDSOd6hlVBcWH05EPIjJNDQ8GW9EgCXKtygvHBBK7TmrQVhwtukDfiwhi5MFWTBQ5OXLD3diV8P6DgcgIP3OdUZPZ8XqmMXkrIpenNIOq4g5uRqdLTLd4wZEBgXoe1thU1ycYLXmBWKLp4hXTQouImECAb5pcO02iJz+4PCkJDyUUG3jPmrj2CYeroQKbLqtLl+RDt8X8opRjigCCzDmbXmTiAMF/Byr27it87Mw/RUDCLN3sV1N3NYAxW+PTgOj+6mgx7S6DG9Dq+FoFILAG7nZfj3PKrQj8shx3zqtzTROAAAhcAcGXu3EvYcO3Ebhxab4F2gQglM4LO4xUhs9tYjcLvqHAyAU1VvMNf3juf0hwjNppwlzJAAAAAElFTkSuQmCC) no-repeat center"></div>','\t<div style="position:absolute;left:0;top:0;width:100%;height:100%;background:#000;opacity:.75;'+(ltIE8()?"filter:alpha(opacity=75)":"")+'"></div>','\t<div style="width:100%;height:100%;position:relative;z-index:1;text-align:center;line-height:0;font-size:0"></div>',"</div>"].join(""),e=t.firstChild,makeArray(e.childNodes).forEach(function(e){1===e.nodeType&&n.push(e)}),n[0].addEventListener("click",function(){PopupImage.hide()},!1),slot=n[n.length-1],doc.body.appendChild(e),e},ltIE8=function(){var cache=!1;return function(){return null==cache&&(cache=eval("!-[1,]")),cache}},getImageHTML=function(e){return['<div style="display:inline-block;width:0;height:100%;vertical-align:middle;"></div>','<img style="max-width:90%;max-height:90%;vertical-align:middle;" src="'+e+'">'].join("")};return PopupImage.show=function(e){element||(element=create()),slot.innerHTML=getImageHTML(e),element.style.display="block"},PopupImage.hide=function(){element.style.display="none",slot.innerHTML=""},PopupImage}();!function(e){if(e.length){e.forEach(function(e){e.addEventListener("click",function(){!function(e){var t=e.getAttribute("data-src");t&&PopupImage.show(t)}(e)},!1)})}}($$(".hc-pics img"))}(document,window);