!function(e, t){"object" == typeof exports && "object" == typeof module?module.exports = t(require("moment"), require("fullcalendar")):"function" == typeof define && define.amd?define(["moment", "fullcalendar"], t):"object" == typeof exports?t(require("moment"), require("fullcalendar")):t(e.moment, e.FullCalendar)}("undefined" != typeof self?self:this, function(e, t){return function(e){function t(n){if (r[n])return r[n].exports; var s = r[n] = {i:n, l:!1, exports:{}}; return e[n].call(s.exports, s, s.exports, t), s.l = !0, s.exports}var r = {}; return t.m = e, t.c = r, t.d = function(e, r, n){t.o(e, r) || Object.defineProperty(e, r, {configurable:!1, enumerable:!0, get:n})}, t.n = function(e){var r = e && e.__esModule?function(){return e.default}:function(){return e}; return t.d(r, "a", r), r}, t.o = function(e, t){return Object.prototype.hasOwnProperty.call(e, t)}, t.p = "", t(t.s = 189)}({0:function(t, r){t.exports = e}, 1:function(e, r){e.exports = t}, 189:function(e, t, r){Object.defineProperty(t, "__esModule", {value:!0}), r(190); var n = r(1); n.datepickerLocale("ru", "ru", {closeText:"Закрыть", prevText:"&#x3C;Пред", nextText:"След&#x3E;", currentText:"Сегодн�?", monthNames:["Январь", "Февраль", "Март", "�?прель", "Май", "Июнь", "Июль", "�?вгу�?т", "Сент�?брь", "Окт�?брь", "�?о�?брь", "Декабрь"], monthNamesShort:["Янв", "Фев", "Мар", "�?пр", "Май", "Июн", "Июл", "�?вг", "Сен", "Окт", "�?о�?", "Дек"], dayNames:["во�?кре�?енье", "понедельник", "вторник", "�?реда", "четверг", "п�?тница", "�?уббота"], dayNamesShort:["в�?к", "пнд", "втр", "�?рд", "чтв", "птн", "�?бт"], dayNamesMin:["В�?", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб"], weekHeader:"�?ед", dateFormat:"dd.mm.yy", firstDay:1, isRTL:!1, showMonthAfterYear:!1, yearSuffix:""}), n.locale("ru", {buttonText:{month:"Ме�?�?ц", week:"�?едел�?", day:"День", list:"Пове�?тка дн�?"}, allDayText:"Ве�?ь день", eventLimitText:function(e){return"+ ещё " + e}, noEventsMessage:"�?ет �?обытий дл�? отображени�?"})}, 190:function(e, t, r){!function(e, t){t(r(0))}(0, function(e){function t(e, t){var r = e.split("_"); return t % 10 == 1 && t % 100 != 11?r[0]:t % 10 >= 2 && t % 10 <= 4 && (t % 100 < 10 || t % 100 >= 20)?r[1]:r[2]}function r(e, r, n){var s = {ss:r?"�?екунда_�?екунды_�?екунд":"�?екунду_�?екунды_�?екунд", mm:r?"минута_минуты_минут":"минуту_минуты_минут", hh:"ча�?_ча�?а_ча�?ов", dd:"день_дн�?_дней", MM:"ме�?�?ц_ме�?�?ца_ме�?�?цев", yy:"год_года_лет"}; return"m" === n?r?"минута":"минуту":e + " " + t(s[n], + e)}var n = [/^�?нв/i, /^фев/i, /^мар/i, /^апр/i, /^ма[й�?]/i, /^июн/i, /^июл/i, /^авг/i, /^�?ен/i, /^окт/i, /^но�?/i, /^дек/i]; return e.defineLocale("ru", {months:{format:"�?нвар�?_феврал�?_марта_апрел�?_ма�?_июн�?_июл�?_авгу�?та_�?ент�?бр�?_окт�?бр�?_но�?бр�?_декабр�?".split("_"), standalone:"�?нварь_февраль_март_апрель_май_июнь_июль_авгу�?т_�?ент�?брь_окт�?брь_но�?брь_декабрь".split("_")}, monthsShort:{format:"�?нв._февр._мар._апр._ма�?_июн�?_июл�?_авг._�?ент._окт._но�?б._дек.".split("_"), standalone:"�?нв._февр._март_апр._май_июнь_июль_авг._�?ент._окт._но�?б._дек.".split("_")}, weekdays:{standalone:"во�?кре�?енье_понедельник_вторник_�?реда_четверг_п�?тница_�?уббота".split("_"), format:"во�?кре�?енье_понедельник_вторник_�?реду_четверг_п�?тницу_�?убботу".split("_"), isFormat:/\[ ?[Вв] ?(?:прошлую|�?ледующую|�?ту)? ?\] ?dddd/}, weekdaysShort:"в�?_пн_вт_�?р_чт_пт_�?б".split("_"), weekdaysMin:"в�?_пн_вт_�?р_чт_пт_�?б".split("_"), monthsParse:n, longMonthsParse:n, shortMonthsParse:n, monthsRegex:/^(�?нвар[ь�?]|�?нв\.?|феврал[ь�?]|февр?\.?|марта?|мар\.?|апрел[ь�?]|апр\.?|ма[й�?]|июн[ь�?]|июн\.?|июл[ь�?]|июл\.?|авгу�?та?|авг\.?|�?ент�?бр[ь�?]|�?ент?\.?|окт�?бр[ь�?]|окт\.?|но�?бр[ь�?]|но�?б?\.?|декабр[ь�?]|дек\.?)/i, monthsShortRegex:/^(�?нвар[ь�?]|�?нв\.?|феврал[ь�?]|февр?\.?|марта?|мар\.?|апрел[ь�?]|апр\.?|ма[й�?]|июн[ь�?]|июн\.?|июл[ь�?]|июл\.?|авгу�?та?|авг\.?|�?ент�?бр[ь�?]|�?ент?\.?|окт�?бр[ь�?]|окт\.?|но�?бр[ь�?]|но�?б?\.?|декабр[ь�?]|дек\.?)/i, monthsStrictRegex:/^(�?нвар[�?ь]|феврал[�?ь]|марта?|апрел[�?ь]|ма[�?й]|июн[�?ь]|июл[�?ь]|авгу�?та?|�?ент�?бр[�?ь]|окт�?бр[�?ь]|но�?бр[�?ь]|декабр[�?ь])/i, monthsShortStrictRegex:/^(�?нв\.|февр?\.|мар[т.]|апр\.|ма[�?й]|июн[ь�?.]|июл[ь�?.]|авг\.|�?ент?\.|окт\.|но�?б?\.|дек\.)/i, longDateFormat:{LT:"H:mm", LTS:"H:mm:ss", L:"DD.MM.YYYY", LL:"D MMMM YYYY г.", LLL:"D MMMM YYYY г., H:mm", LLLL:"dddd, D MMMM YYYY г., H:mm"}, calendar:{sameDay:"[Сегодн�?, в] LT", nextDay:"[Завтра, в] LT", lastDay:"[Вчера, в] LT", nextWeek:function(e){if (e.week() === this.week())return 2 === this.day()?"[Во] dddd, [в] LT":"[В] dddd, [в] LT"; switch (this.day()){case 0:return"[В �?ледующее] dddd, [в] LT"; case 1:case 2:case 4:return"[В �?ледующий] dddd, [в] LT"; case 3:case 5:case 6:return"[В �?ледующую] dddd, [в] LT"}}, lastWeek:function(e){if (e.week() === this.week())return 2 === this.day()?"[Во] dddd, [в] LT":"[В] dddd, [в] LT"; switch (this.day()){case 0:return"[В прошлое] dddd, [в] LT"; case 1:case 2:case 4:return"[В прошлый] dddd, [в] LT"; case 3:case 5:case 6:return"[В прошлую] dddd, [в] LT"}}, sameElse:"L"}, relativeTime:{future:"через %s", past:"%s назад", s:"не�?колько �?екунд", ss:r, m:r, mm:r, h:"ча�?", hh:r, d:"день", dd:r, M:"ме�?�?ц", MM:r, y:"год", yy:r}, meridiemParse:/ночи|утра|дн�?|вечера/i, isPM:function(e){return/^(дн�?|вечера)$/.test(e)}, meridiem:function(e, t, r){return e < 4?"ночи":e < 12?"утра":e < 17?"дн�?":"вечера"}, dayOfMonthOrdinalParse:/\d{1,2}-(й|го|�?)/, ordinal:function(e, t){switch (t){case"M":case"d":case"DDD":return e + "-й"; case"D":return e + "-го"; case"w":case"W":return e + "-�?"; default:return e}}, week:{dow:1, doy:4}})})}})});