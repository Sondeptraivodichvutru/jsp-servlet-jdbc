!function(e, t){"object" == typeof exports && "object" == typeof module?module.exports = t(require("moment"), require("fullcalendar")):"function" == typeof define && define.amd?define(["moment", "fullcalendar"], t):"object" == typeof exports?t(require("moment"), require("fullcalendar")):t(e.moment, e.FullCalendar)}("undefined" != typeof self?self:this, function(e, t){return function(e){function t(r){if (n[r])return n[r].exports; var a = n[r] = {i:r, l:!1, exports:{}}; return e[r].call(a.exports, a, a.exports, t), a.l = !0, a.exports}var n = {}; return t.m = e, t.c = n, t.d = function(e, n, r){t.o(e, n) || Object.defineProperty(e, n, {configurable:!1, enumerable:!0, get:r})}, t.n = function(e){var n = e && e.__esModule?function(){return e.default}:function(){return e}; return t.d(n, "a", n), n}, t.o = function(e, t){return Object.prototype.hasOwnProperty.call(e, t)}, t.p = "", t(t.s = 207)}({0:function(t, n){t.exports = e}, 1:function(e, n){e.exports = t}, 207:function(e, t, n){Object.defineProperty(t, "__esModule", {value:!0}), n(208); var r = n(1); r.datepickerLocale("uk", "uk", {closeText:"Закрити", prevText:"&#x3C;", nextText:"&#x3E;", currentText:"Сьогодні", monthNames:["Січень", "Лютий", "Березень", "Квітень", "Травень", "Червень", "Липень", "Серпень", "Вере�?ень", "Жовтень", "Ли�?топад", "Грудень"], monthNamesShort:["Січ", "Лют", "Бер", "Кві", "Тра", "Чер", "Лип", "Сер", "Вер", "Жов", "Ли�?", "Гру"], dayNames:["неділ�?", "понеділок", "вівторок", "�?ереда", "четвер", "п’�?тниц�?", "�?убота"], dayNamesShort:["нед", "пнд", "вів", "�?рд", "чтв", "птн", "�?бт"], dayNamesMin:["�?д", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб"], weekHeader:"Тиж", dateFormat:"dd.mm.yy", firstDay:1, isRTL:!1, showMonthAfterYear:!1, yearSuffix:""}), r.locale("uk", {buttonText:{month:"Мі�?�?ць", week:"Тиждень", day:"День", list:"Пор�?док денний"}, allDayText:"Уве�?ь день", eventLimitText:function(e){return"+ще " + e + "..."}, noEventsMessage:"�?емає подій дл�? відображенн�?"})}, 208:function(e, t, n){!function(e, t){t(n(0))}(0, function(e){function t(e, t){var n = e.split("_"); return t % 10 == 1 && t % 100 != 11?n[0]:t % 10 >= 2 && t % 10 <= 4 && (t % 100 < 10 || t % 100 >= 20)?n[1]:n[2]}function n(e, n, r){var a = {ss:n?"�?екунда_�?екунди_�?екунд":"�?екунду_�?екунди_�?екунд", mm:n?"хвилина_хвилини_хвилин":"хвилину_хвилини_хвилин", hh:n?"година_години_годин":"годину_години_годин", dd:"день_дні_днів", MM:"мі�?�?ць_мі�?�?ці_мі�?�?ців", yy:"рік_роки_років"}; return"m" === r?n?"хвилина":"хвилину":"h" === r?n?"година":"годину":e + " " + t(a[r], + e)}function r(e, t){var n = {nominative:"неділ�?_понеділок_вівторок_�?ереда_четвер_п’�?тниц�?_�?убота".split("_"), accusative:"неділю_понеділок_вівторок_�?ереду_четвер_п’�?тницю_�?уботу".split("_"), genitive:"неділі_понеділка_вівторка_�?ереди_четверга_п’�?тниці_�?уботи".split("_")}; return e?n[/(\[[ВвУу]\]) ?dddd/.test(t)?"accusative":/\[?(?:минулої|на�?тупної)? ?\] ?dddd/.test(t)?"genitive":"nominative"][e.day()]:n.nominative}function a(e){return function(){return e + "о" + (11 === this.hours()?"б":"") + "] LT"}}return e.defineLocale("uk", {months:{format:"�?ічн�?_лютого_березн�?_квітн�?_травн�?_червн�?_липн�?_�?ерпн�?_вере�?н�?_жовтн�?_ли�?топада_грудн�?".split("_"), standalone:"�?ічень_лютий_березень_квітень_травень_червень_липень_�?ерпень_вере�?ень_жовтень_ли�?топад_грудень".split("_")}, monthsShort:"�?іч_лют_бер_квіт_трав_черв_лип_�?ерп_вер_жовт_ли�?т_груд".split("_"), weekdays:r, weekdaysShort:"нд_пн_вт_�?р_чт_пт_�?б".split("_"), weekdaysMin:"нд_пн_вт_�?р_чт_пт_�?б".split("_"), longDateFormat:{LT:"HH:mm", LTS:"HH:mm:ss", L:"DD.MM.YYYY", LL:"D MMMM YYYY р.", LLL:"D MMMM YYYY р., HH:mm", LLLL:"dddd, D MMMM YYYY р., HH:mm"}, calendar:{sameDay:a("[Сьогодні "), nextDay:a("[Завтра "), lastDay:a("[Вчора "), nextWeek:a("[У] dddd ["), lastWeek:function(){switch (this.day()){case 0:case 3:case 5:case 6:return a("[Минулої] dddd [").call(this); case 1:case 2:case 4:return a("[Минулого] dddd [").call(this)}}, sameElse:"L"}, relativeTime:{future:"за %s", past:"%s тому", s:"декілька �?екунд", ss:n, m:n, mm:n, h:"годину", hh:n, d:"день", dd:n, M:"мі�?�?ць", MM:n, y:"рік", yy:n}, meridiemParse:/ночі|ранку|дн�?|вечора/, isPM:function(e){return/^(дн�?|вечора)$/.test(e)}, meridiem:function(e, t, n){return e < 4?"ночі":e < 12?"ранку":e < 17?"дн�?":"вечора"}, dayOfMonthOrdinalParse:/\d{1,2}-(й|го)/, ordinal:function(e, t){switch (t){case"M":case"d":case"DDD":case"w":case"W":return e + "-й"; case"D":return e + "-го"; default:return e}}, week:{dow:1, doy:7}})})}})});