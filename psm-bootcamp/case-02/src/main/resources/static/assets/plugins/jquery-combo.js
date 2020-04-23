(function($) {

	$.fn.combobox = function(options) {

		// Default options
		var settings = $.extend({
			data : [],
			valueAttribute : 'value',
			labelAttribute : 'label',
			firstItemValue : '',
			firstItemLabel : '-- Pilih --'
		}, options);

		// Apply options
		var element = this;
		$(element).empty().append($("<option></option>").attr("value", settings.firstItemValue).text(settings.firstItemLabel));
		$.each(settings.data, function(key, obj) {
			$(element).append($("<option></option>").attr("value", obj[settings.valueAttribute]).text(obj[settings.labelAttribute]));
		});
		return element;

	};

}(jQuery));