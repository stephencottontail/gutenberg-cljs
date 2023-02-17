<?php
/**
 * Plugin Name: Gutenberg + ClojureScript
 * Plugin Author: Stephen Dickinson <stephencottontail@me.com>
 * Version: 0.1.0
 */

if ( ! defined( 'WPINC' ) ) {
    die;
}
/*
add_action( 'block_categories_all', function( $categories ) {
    return array_merge( $categories, array(
	'title' => 'ClojureScript',
	'slug'  => 'cljs'
    ) );
} );
*/
add_action( 'init', function() {
    wp_register_script( 'cljs-embed', plugin_dir_url( __FILE__ ) . '/resources/public/js/main.js', array( 'react', 'wp-blocks' ), null, true );
    //wp_register_script( 'cljs-embed', plugin_dir_url( __FILE__ ) . '/target/public/cljs-out/dev/main_bundle.js', array( 'wp-blocks' ), null, true );
    
    register_block_type( 'cljs/embed', array(
	'editor_script' => 'cljs-embed',
    ) );
} );
