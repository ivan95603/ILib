package com.ivan.diplomski.ILIB;

public class ILib_CSSStyle
{
    String Style;
    String Value;

    public ILib_CSSStyle(String style, String value) {
        Style = style;
        Value = value;
    }

    @Override
    public String toString() {
        return this.Style + " : " + this.Value + "; ";
    }

    //style="color:blue; background-color: powderblue;"
    public enum CSSStyles
    {
        //https://www.w3schools.com/cssref/default.asp

        /**
         * Color Properties
         */
        color("color"),
        opacity("opacity"),

        /**
         * Background and Border Properties
         */
        background("background"),
        background_attachment("background-attachment"),
        background_blend_mode("background-blend-mode"),
        background_color("background-color"),
        background_image("background-image"),
        background_position("background-position"),
        background_repeat("background-repeat"),
        background_clip("background-clip"),
        background_origin("background-origin"),
        background_size("background-size"),
        border("border"),
        border_radius("border-radius"),
        border_bottom("border-bottom"),
        border_bottom_color("border-bottom-color"),
        border_bottom_left_radius("border-bottom-left-radius"),
        border_top_right_radius("border-top-right-radius"),
        border_top_style("border-top-style"),
        border_top_width("border-top-width"),
        border_width("border-width"),
        box_decoration_break("box-decoration-break"),
        box_shadow("box-shadow"),

        /**
         * Basic Box Properties
         */
        bottom("bottom"),
        clear("clear"),
        clip("clip"),
        display("display"),
        float_("float"),
        height("height"),
        left("left"),
        margin("margin"),
        margin_bottom("margin-bottom"),
        margin_left("margin-left"),
        margin_right("margin-right"),
        margin_top("margin-top"),
        max_height("max-height"),
        max_width("max-width"),
        min_height("min-height"),
        min_width("min-width"),
        overflow("overflow"),
        overflow_x("overflow-x"),
        overflow_y("overflow-y"),
        padding("padding"),
        padding_bottom("padding-bottom"),
        padding_left("padding-left"),
        padding_right("padding-right"),
        padding_top("padding-top"),
        position("position"),
        right("right"),
        top("top"),
        visibility("visibility"),
        width("width"),
        vertical_align("vertical-align"),
        z_index("z-index"),

        /**
         * Flexible Box Layout
         */
        align_content("align-content"),
        align_items("align-items"),
        align_self("align-self"),
        flex("flex"),
        flex_basis("flex-basis"),
        flex_direction("flex-direction"),
        flex_flow("flex-flow"),
        flex_grow("flex-grow"),
        flex_shrink("flex-shrink"),
        flex_wrap("flex-wrap"),
        justify_content("justify-content"),
        order("order"),

        /**
         * Text Properties
         */
        hanging_punctuation("hanging-punctuation"),
        hyphens("hyphens"),
        letter_spacing("letter-spacing"),
        line_break("line-break"),
        line_height("line-height"),
        overflow_wrap("overflow-wrap"),
        tab_size("tab-size"),
        text_align("text-align"),
        text_align_last("text-align-last"),
        text_combine_upright("text-combine-upright"),
        text_indent("text-indent"),
        text_justify("text-justify"),
        text_transform("text-transform"),
        white_space("white-space"),
        word_break("word-break"),
        word_spacing("word-spacing"),
        word_wrap("word-wrap"),

        /**
         * Text Decoration Properties
         */
        text_decoration("text-decoration"),
        text_decoration_color("text-decoration-color"),
        text_decoration_line("text-decoration-line"),
        text_decoration_style("text-decoration-style"),
        text_shadow("text-shadow"),
        text_underline_position("text-underline-position"),

        /**
         * Font Properties
         */
        font_face("@font-face"),
        font_feature_values("@font-feature-values"),
        font("font"),
        font_family("font-family"),
        font_feature_settings("font-feature-settings"),
        font_kerning("font-kerning"),
        font_language_override("font-language-override"),
        font_size("font-size"),
        font_size_adjust("font-size-adjust"),
        font_stretch("font-stretch"),
        font_style("font-style"),
        font_synthesis("font-synthesis"),
        font_variant("font-variant"),
        font_variant_alternates("font-variant-alternates"),
        font_variant_caps("font-variant-caps"),
        font_variant_east_asian("font-variant-east-asian"),
        font_variant_ligatures("font-variant-ligatures"),
        font_variant_numeric("font-variant-numeric"),
        font_variant_position("font-variant-position"),
        font_weight("font-weight"),

        /**
         * Writing Modes Properties
         */
        direction("direction"),
        text_orientation("text-orientation"),
        unicode_bidi("unicode-bidi"),
        user_select("user-select"),
        writing_mode("writing-mode"),

        /**
         * Table Properties
         */
        border_collapse("border-collapse"),
        border_spacing("border-spacing"),
        caption_side("caption-side"),
        empty_cells("empty-cells"),
        table_layout("table-layout"),

        /**
         * Lists and Counters Properties
         */
        counter_increment("counter-increment"),
        counter_reset("counter-reset"),
        list_style("list-style"),
        list_style_image("list-style-image"),
        list_style_position("list-style-position"),
        list_style_type("list-style-type"),

        /**
         * Animation Properties
         */
        keyframes("@keyframes"),
        animation("animation"),
        animation_delay("animation-delay"),
        animation_direction("animation-direction"),
        animation_duration("animation-duration"),
        animation_fill_mode("animation-fill-mode"),
        animation_iteration_count("animation-iteration-count"),
        animation_name("animation-name"),
        animation_play_state("animation-play-state"),
        animation_timing_function("animation-timing-function"),

        /**
         * Transform Properties
         */
        backface_visibility("backface-visibility"),
        perspective("perspective"),
        perspective_origin("perspective-origin"),
        transform("transform"),
        transform_origin("transform-origin"),
        transform_style("transform-style"),

        /**
         * Transitions Properties
         */
        transition("transition"),
        transition_property("transition-property"),
        transition_duration("transition-duration"),
        transition_timing_function("transition-timing-function"),
        transition_delay("transition-delay"),

        /**
         * Basic User Interface Properties
         */
        box_sizing("box-sizing"),
        content("content"),
        cursor("cursor"),
        ime_mode("ime-mode"),
        nav_down("nav-down"),
        nav_index("nav-index"),
        nav_left("nav-left"),
        nav_right("nav-right"),
        nav_up("nav-up"),
        outline("outline"),
        outline_color("outline-color"),
        outline_offset("outline-offset"),
        outline_style("outline-style"),
        outline_width("outline-width"),
        resize("resize"),
        text_overflow("text-overflow"),

        /**
         * Multi-column Layout Properties
         */
        break_after("break-after"),
        break_before("break-before"),
        break_inside("break-inside"),
        column_count("column-count"),
        column_fill("column-fill"),
        column_gap("column-gap"),
        column_rule("column-rule"),
        column_rule_color("column-rule-color"),
        column_rule_style("column-rule-style"),
        column_rule_width("column-rule-width"),
        column_span("column-span"),
        column_width("column-width"),
        columns("columns"),
        widows("widows"),

        /**
         * Paged Media
         */
        orphans("orphans"),
        page_break_after("page-break-after"),
        page_break_before("page-break-before"),
        page_break_inside("page-break-inside"),

        /**
         * Generated Content for Paged Media
         */
        marks("marks"),
        quotes("quotes"),

        /**
         * Filter Effects Properties
         */
        filter("filter"),

        /**
         * Image Values and Replaced Content
         */
        image_orientation("image-orientation"),
        image_rendering("image-rendering"),
        image_resolution("image-resolution"),
        object_fit("object-fit"),
        object_position("object-position"),

        /**
         * Masking Properties
         */
        mask("mask"),
        mask_type("mask-type"),

        /**
         * Speech Properties
         */
        mark("mark"),
        mark_after("mark-after"),
        mark_before("mark-before"),
        phonemes("phonemes"),
        rest("rest"),
        rest_after("rest-after"),
        rest_before("rest-before"),
        voice_balance("voice-balance"),
        voice_duration("voice-duration"),
        voice_pitch("voice-pitch"),
        voice_pitch_range("voice-pitch-range"),
        voice_rate("voice-rate"),
        voice_stress("voice-stress"),
        voice_volume("voice-volume"),

        /**
         * Marquee Properties
         */
        marquee_direction("marquee-direction"),
        marquee_play_count("marquee-play-count"),
        marquee_speed("marquee-speed"),
        marquee_style("marquee-style");

        private String attribute;

        private CSSStyles(String attribute) {
            this.attribute = attribute;
        }

        @Override
        public String toString() {
            return attribute;
        }
    }
}
