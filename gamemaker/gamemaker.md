# Game Maker: Studio 1.4

## [Movement](https://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fmovement%20and%20collisions%2Fmovement%2Findex.html)

* [x­](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/x.html)

The x value of an instance is the horizontal position in the current room, measured in pixels. This value can be either 0, positive or minus, where 0 is the left hand side of the room and moving right increases x, moving left decreases x (a negative value for x means that the instance has gone outside the left side of the room). You can even give x a real value like 12.345, but as you cannot get .345 of a pixel, the instance may not appear to have moved, although these values will be maintained and used internally by GameMaker: Studio and are perfectly valid.

By setting the x (and y) values you can make the object jump around the room to the position of your choice, or you can add and subtract to them by smaller amounts to give the illusion of movement without actually using the built in speed and direction functions. This should be taken into account when making your games as often one type of movement lends itself to a particular style of game-play more than another.

* [y](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/y.html)

The y value of an instance is the vertical position in the current room, measured in pixels. This value can be either 0, positive or minus, where 0 is the top of the room and moving down increases y, moving up decreases y (a negative value for y means that the instance has gone outside the top of the room). You can even give y a real value like 12.345, but as you cannot get .345 of a pixel, the instance may not appear to have moved, although these values will be maintained and used internally by GameMaker: Studio and are perfectly valid.

By setting the y (and x) values you can make the object jump around the room to the position of your choice, or you can add and subtract to them by smaller amounts to give the illusion of movement without actually using the built in speed and direction functions. This should be taken into account when making your games as often one type of movement lends itself to a particular style of game-play more than another.

* [hspeed](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/hspeed.html)

­All instances in GameMaker: Studio have certain "built in" properties that you can use and set to govern how they look and behave. hspeed is one of those properties and defines the horizontal movement speed of the instance in pixels per step. So, an hspeed of 3 means 3 pixels of movement to the right (+x) every step, and an hspeed of -3 would mean 3 pixels of movement to the left (-x) every step.

* [vspeed](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/vspeed.html)­

All instances in GameMaker: Studio have certain "built in" properties that you can use and set to govern how they look and behave. vspeed is one of those properties and defines the vertical movement speed of the instance in pixels per step. So, a vspeed of 3 means 3 pixels of movement down the screen (+y) every step, and a vspeed of -3 would mean 3 pixels of movement up the screen (-y) every step.

* [speed](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/speed.html)­

All instances in GameMaker: Studio have certain "built in" properties that you can use and set to govern how they look and behave. speed is one of those properties and defines how many pixels the instance will move every step. Unlike hspeed and vspeed, speed has no direction associated it with it as this is governed by the direction value of the instance, but it can have a negative value, in which case the instance will travel in the opposite direction to that set by the direction function (ie: direction - 180°).

* [direction](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/direction.html)­

All instances in GameMaker: Studio have certain "built in" properties that you can use and set to govern how they look and behave. Direction is one of those properties and can be used to set the direction of movement of the instance when the instance has a speed other than 0. Note that directions in GameMaker: Studio are usually calculated as 0° being right, 90° being up, 180° being left and 270° being down.

* [move_towards_point(x, y, velocidad)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/move_towards_point.html)­

This function simply tells the instance running the code to move towards a set point at a set speed. Bear in mind that it is up to you to tell it what to do once it gets there, as it won't just stop by itself. This means that you can get a "vibrating" instance as it moves (for example) 3 pixels forward, overshoots the x/y target position by 2, then moves 3 pixels back again, overshooting the target point by one and so on... There are a number of ways that this can be avoided, for example using distance_to_point to see how far from the specified location the instance is before moving.

Note: this function sets the speed of the instance, so even if you stop using this code, the instance will keep moving in the previous direction, so it is necessary to set the instance speed to 0 if you wish it to stop.

## [Collisions](https://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fmovement%20and%20collisions%2Fcollisions%2Findex.html)

* [place_empty(x, y)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/collisions/place_empty.html)

You can use this function to check and see if the calling instance would collide with any other instance in your game. Now, it should be noted that for this to work, the instance running the code must have a valid collision mask (either for the sprite itself, or through the mask_index.) and it will only register collisions with those instances that also have a valid mask.

The function itself basically works by taking the instance and testing for collisions when placed at the position specified by the x/y arguments. The collision checking can be either precise or based on the bounding box of the instance, depending on what kind of collision mask has been selected.

Note that the given x/y coordinates will be floored to the nearest integer before the check is performed.

* [place_free(x, y)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/collisions/place_free.html)

You can use this function to check and see if the calling instance would collide with any instance flagged as solid in your game. Now, it should be noted that for this to work, the instance running the code must have a valid collision mask (either for the sprite itself, or through the mask_index.) and it will only register collisions with those solid flagged instances that also have a valid mask.

The function itself basically works by taking the instance and testing for collisions with only solid flagged instances when placed at the position specified by the x/y arguments. The collision checking can be either precise or based on the bounding box of the instance, depending on what kind of collision mask has been selected.

Note that the given x/y coordinates will be floored to the nearest integer before the check is performed.

## [Instance Properties](https://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fobjects%20and%20instances%2Finstances%2Finstance%20properties%2Findex.html)

* [image_alpha](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_alpha.html)

This variable is used to get or to set the alpha value for the sprite. Alpha is always calculated as a value between 0 and 1 where 0 is completely transparent and 1 is completely opaque. Please note that for changes in this variable to be visible, the instance should have either no draw event (and so GameMaker: Studio will default draw the sprite) or be drawn using one of the extended drawing functions like `draw_self()` or `draw_sprite_ext()`.

NOTE: On the HTML5 platform, this variable is not clamped. Therefore if you have a value greater than one, it will "wrap" back to 0 again, giving flickering results. Likewise if you go below 0, the alpha will "wrap" back to 1. You can use the function clamp for this.

* [image_angle](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_angle.html)­

This value sets the angle (rotation) of the sprite and is measured in degrees, with the right being 0º, up being 90º, left being 180º and down being 270º. Set this variable to 0 to reset the sprite to be drawn as was defined in the sprite editor. Please note that for changes in this variable to be visible, the instance should have either no draw event (and so GameMaker: Studio will default draw the sprite) or be drawn using one of the extended drawing functions like `draw_self()` or `draw_sprite_ext()`.

* [image_blend](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_blend.html)­

This variable controls the "tinting" of the instance sprite and the default value is -1 (but can also be c_white). Any other value (including internal colour constants like c_red, or c_aqua) will blend the specified colour with the original sprite. Please note that for changes in this variable to be visible, the instance should have either no draw event (and so GameMaker: Studio will default draw the sprite) or be drawn using one of the extended drawing functions like `draw_self()` or `draw_sprite_ext()`.

* [image_speed](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_speed.html)

This variable determines the speed in which GameMaker: Studio will cycle through the sub-images for the current instance sprite. A value of 0 will cause no cycling, while a value of 1 will cycle one image per step, but you are not limited to this range as you can use values greater than 1 to animate faster (frames will be skipped), decimal values to animate slower (frames will be shown over various steps) or even negative values to reverse the speed of the animation.

* [image_index](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_index.html)­

A sprite is made up of one or more sub-images which can make the sprite appear animated as they switch from one to the other, or can they can be switched between in code to give different "states", much like a button has in windows. If the sprite is animated, then you can get the current frame of the animation by checking the image_index variable, or if you want to change the state of a static sprite, you can select a new sub-image by setting this variable to the desired sub-image for the sprite. Please note that for changes in this variable to be visible, the instance should have either no draw event (and so GameMaker: Studio will default draw the sprite) or be drawn using one of the extended drawing functions like `draw_self()` or `draw_sprite_ext()`.

Please note that while using skeletal animation sprites, you can still get and set the image_index values - see the function skeleton_animation_get_duration for examples of how to do this.

* [image_xscale](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_xscale.html)­

This value sets the horizontal scaling applied to the sprite that has been assigned to the current instance. A scale of 1 indicates no scaling (1:1), smaller values will scale down (0.5, for example, will half the width of the sprite), larger values will scale up and negative values will flip the sprite and scale it unless the value used is exactly -1 (in which case the sprite is just flipped about its origin with no scaling).

* [image_yscale](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/image_yscale.html)­

This value sets the vertical scaling applied to the sprite that has been assigned to the current instance. A scale of 1 indicates no scaling (1:1), smaller values will scale down (0.5, for example, will half the width of the sprite), larger values will scale up and negative values will mirror the sprite and scale it unless the value used is exactly -1 (in which case the sprite is just mirrored about its origin with no scaling).

* [visible](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/visible.html)­

An instance can be flagged as visible or not by setting this variable to true (visible) or false (invisible). This works by telling GameMaker: Studio to skip the draw event for this instance, so care must be taken when using this as it means that no code placed in the draw event will be run while the instance is not visible.

* [sprite_index](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20properties/sprite_index.html)­

This variable returns the index of the current sprite for the instance, or -1 if the instance has no sprite associated with it. You can change it to give the instance a different sprite by giving it the name of a sprite from the resource tree or by using a variable that has an externally loaded sprite indexed in it. Changing the sprite does not change the index of the currently visible sub-image, so if you change the sprite on sub-image number 3, the new sprite will be drawn with that sub-image visible (assuming it has the same number of sub-images).

## [Colors](http://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fdrawing%2Fcolour%20and%20blending%2Findex.html)

* [make_color_rgb(red, green, bule)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/colour%20and%20blending/make_colour_rgb.html)

GameMaker: Studio provides this function (as well as others) to permit the user to make their own colours. This particular function takes three component parts, the red, the green and the blue components of the colour that you wish to make. These values are taken as being between 0 and 255 so you can make 16,777,216 (256*256*256) colours with this!

## [Keyboard Input](http://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/keyboard%20input/index.html)

* [keyboard_check(key)](http://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/keyboard%20input/keyboard_check.html)­

With this function you can check to see if a key is held down or not. Unlike the keyboard_check_pressed or keyboard_check_released functions which are only triggered once when the key is pressed or released, this function is triggered every step that the key is held down for.

* [keyboard_check_pressed(key)](http://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/keyboard%20input/keyboard_check_pressed.html)­

With this function you can check to see if a key has been pressed or not. Unlike the keyboard_check function, this function will only run once for every time the key is pressed down, so for it to trigger again, the key must be first released and then pressed again.

* [keyboard_check_released(key)](http://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/keyboard%20input/keyboard_check_released.html)­

With this function you can check to see if a key has been released or not. Unlike the keyboard_check function, this function will only run once for every time the key is lifted, so for it to trigger again, the key must be first pressed and then released again.

* [ord(str)](https://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fstrings%2Ford.html)­

This function takes a string (of a single character only) and returns the Unicode value for that character. In this way you can, for example, store as integers individual key presses, and it is most commonly used by the `keyboard_check()` functions.

* [keyboard_string](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/keyboard%20input/keyboard_string.html)

This variable holds a string containing the last (at most) 1024 characters typed on the keyboard. This string will only contain printable characters typed, but it will correctly respond to pressing the backspace key by erasing the last character. This variable is not read only and you can change it, for example to set it to "" (an empty string) if you handled it already, or use the String Functions to manipulate it.

## [Mouse Input](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/mouse%20input/index.html)

* [mouse_x](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/mouse%20input/mouse_x.html)­

This read-only variable returns the current x axis position of the mouse within the room.

* [mouse_y](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/mouse%20input/mouse_y.html)­

This read-only variable returns the current y axis position of the mouse within the room.

* [mouse_check_button(button)](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/mouse%20input/mouse_check_button.html)­

This function will return true if the mouse button being checked is held down or false if it is not.

* [mouse_check_button_pressed(button)](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/mouse%20input/mouse_check_button_pressed.html)­

This function will return true if the mouse button being checked has been pressed or false if it has not. This function will only be triggered once for any mouse button when it is first pressed and to trigger it again the button will need to have been released and pressed again.

* [mouse_check_button_released(button)](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/mouse%20input/mouse_check_button_released.html)­

This function will return true if the mouse button being checked has been released or false if it has not. This function will only be triggered once for any mouse button when it is released and to trigger it again the button will need to have been pressed and released again.

## [Instance Functions](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20functions/index.html)

* [instance_create(x, y, object)](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20functions/instance_create.html)­

With this function you can create a new instance of the specified object at any given point within the room. This function returns the id of the new instance which can then be stored in a variable or used to access that instance. Note that this function will also call the create event of the instance being created before continuing with the code or actions for the event that used the function.

* [instance_nearest(x, y)](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20functions/instance_nearest.html)­

This function will check all the instances of the given object to see which is nearest to the given point of origin. If no instances of the object exist, the function will return the keyword noone, but if there are instances then it will return the id of the instance found. Please note that if the instance running the code was created as an instance of the object being checked, then it will be included in the check.

* [instance_destroy()](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20functions/instance_destroy.html)­

You call this function whenever you wish to "destroy" an instance, normally triggering a Destroy Event and also a Clean Up event. This will remove it from the room until the room is restarted (unless the room is persistent). Calling the function with no arguments will simply destroy the instance that is currently in scope and running the code, but you can provide an optional "id" argument and target a specific instance by using the instance ID value, or you can target all instances of a particular object by using an object_index.

* [instance_number(obj)](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20functions/instance_number.html)­

With this function you can find out how many active instances of the specified object exists in the room. Please note that those instances which have been deactivated with the instance_deactivate functions will not be included in this check.

* [instance_exists(obj)](https://docs.yoyogames.com/source/dadiospice/002_reference/objects%20and%20instances/instances/instance%20functions/instance_exists.html)­

This function can be used in two ways depending on what you wish to check. You can give it an object_index to check for, in which case this function will return true if any active instances of the specified object exist in the current room, or you can also supply it with an instance id, in which case this function will return true if that specific instance exists and is active in the current room.

Please note that this function does not take into account those instances that have been deactivated using the instance_deactivate functions.

## [Simple Effects](https://docs.yoyogames.com/source/dadiospice/002_reference/particles/simple%20effects/index.html)

* [effect_create_above(kind, x, y, size, colour)](https://docs.yoyogames.com/source/dadiospice/002_reference/particles/simple%20effects/effect_create_above.html)­

With this function you can create a simple effect above all instances of your room (it is actually created at a depth of -100000). If the effect is anything other ef_rain or ef_snow then you can define an x/y position to create the effect, and the size can be a value of 0, 1, or 2, where 0 is small, 1 is medium and 2 is large.

It is worth noting that these effects can have their drawing toggled on and off, as well as have their drawing paused, by using the functions part_system_automatic_draw and part_system_automatic_update with the appropriate value for the particle system index (where 0 is for effects below and 1 is for effects above).

* [effect_create_below(kind, x, y, size, colour)](https://docs.yoyogames.com/source/dadiospice/002_reference/particles/simple%20effects/effect_create_below.html)­

With this function you can create a simple effect beneath all instances of your room (it is actually created at a depth of 100000). If the effect is anything other ef_rain or ef_snow then you can define an x/y position to create the effect, and the size can be a value of 0, 1, or 2, where 0 is small, 1 is medium and 2 is large.

It is worth noting that these effects can have their drawing toggled on and off, as well as have their drawing paused, by using the functions part_system_automatic_draw and part_system_automatic_update with the appropriate value for the particle system index (where 0 is for effects below and 1 is for effects above).

## [Miscellaneous](https://docs.yoyogames.com/source/dadiospice/002_reference/miscellaneous/index.html)

* [cursor_sprite](https://docs.yoyogames.com/source/dadiospice/002_reference/miscellaneous/cursor_sprite.html)

Setting this variable will instruct GameMaker: Studio to use the designated sprite as a cursor (basically setting it to the current mouse x/y position every step). The default value is -1 which is no sprite for the cursor, but you can assign any sprite index from the game assets or that has been imported from an external resource. Please note that there is no way to control the animation speed or image_index, so if the sprite has sub-images, these will be cycled at the same speed as the room speed. To remove the cursor sprite, you can set this variable to -1 again.

It is also worth noting that this variable does not replace the game window cursor, and that it will still be drawn as normal. To avoid this you can use the function window_set_cursor and set it to the constant cr_none which will make the standard cursor invisible.

* [game_save(filename)](https://docs.yoyogames.com/source/dadiospice/002_reference/miscellaneous/game_save.html)­

With this function you can do a basic save of the game to a given file.

NOTE: This function is very limited and it is designed for the beginner to get a save system up and running quickly, but more advanced users may prefer to code their own system using the File functions, due to the fact that the game will not save any of the dynamic resources like data structures, surfaces, added backgrounds and sprites etc..

* [game_load(filename)](https://docs.yoyogames.com/source/dadiospice/002_reference/miscellaneous/game_load.html)­

With this function you can load a game that has been saved previously (using game_save).

* [game_restart()](https://docs.yoyogames.com/source/dadiospice/002_reference/miscellaneous/game_restart.html)­

With this function you can restart the game. This is essentially the same as running the game for the first time and so the Game Start Event will be triggered, as well as the Game End Event. However it should be noted that global variables will not be re-initialised unless explicitly coded as such - for example, the built-in global variable score will not start at zero after a game restart if it has been modified in the game already. This is also the case for GPU state (so if you have set the draw colour or alpha, for example, it will remain at the changed value).

* [game_end()](https://docs.yoyogames.com/source/dadiospice/002_reference/miscellaneous/game_end.html)

With this function you can end the game (and the Game End Event will be triggered). This will not happen instantaneously, but rather at the end of the current step, so any code you have in the same step after this function has been called will still run. Please note that this function has the following restrictions:

    * It will report an error on the iOS module as it is against the conditions of their respective Marketplaces.
    * It will silently fail on the HTML5 module.
    * It will work on Windows (including Steam Workshop), Android, Linux and Mac.

## [Roms](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/index.html)

* [room_height](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/room_height.html)

This variable holds the height of the current room in pixels. You can change this variable to change the height of the room at any time.

* [room_widht](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/room_width.html)

This variable holds the width of the current room in pixels. You can change this variable to change the width of the room at any time.

* [room_goto(room)](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/room_goto.html)

This function will end the current room and go to the room specified by the input index. The room must exist or else an error will be given, and if you use the same room as the current room it will have the same effect as room_restart. Note that the room will not change until the end of the event where the function was called, so any code after this has been called will still run.

* [room_goto_next()](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/room_goto_next.html)

With this function you can make your game go to the next one as listed in the resource tree at the time the game was compiled. if this room does not exist, and error will be thrown and the game will be forced to close. Note that the room will not change until the end of the event where the function was called, so any code after this has been called will still run.

* [room_goto_previous()](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/room_goto_previous.html)

With this function you can make your game go to the previous one as listed in the resource tree at the time the game was compiled. if this room does not exist, and error will be thrown and the game will be forced to close. Note that the room will not change until the end of the event where the function was called, so any code after this has been called will still run.

* [room_restart()](https://docs.yoyogames.com/source/dadiospice/002_reference/rooms/room_restart.html)

With this function you can restart the current room. Note that the room will not be restarted until the end of the event where the function was called, so any code after this has been called will still run.

## [Debugging](https://docs.yoyogames.com/source/dadiospice/002_reference/debugging/index.html)

* [show_message(str)](https://docs.yoyogames.com/source/dadiospice/002_reference/debugging/show_message.html)

This function creates a pop-up message box which displays the string defined in the code and a button marked "Ok" to close it.

NOTE: THIS FUNCTION IS FOR DEBUG USE ONLY.

* [show_question(str)](https://docs.yoyogames.com/source/dadiospice/002_reference/debugging/show_question.html)

This function creates a pop-up message box with two buttons for "Yes" and "No". It returns true or false depending on which one of the two buttons the user presses.

NOTE: THIS FUNCTION IS FOR DEBUG USE ONLY.

* [get_string(str, default)](https://docs.yoyogames.com/source/dadiospice/002_reference/debugging/get_string.html)

This creates a pop-up window showing a standard message, with a button labeled "Ok", that prompts the user to input a string. The function will return the input string, or the default value if nothing has been entered.

NOTE: THIS FUNCTION IS FOR DEBUG USE ONLY. Should you require this functionality in your final game, please use get_string_async.

* [get_integer(str, default)](https://docs.yoyogames.com/source/dadiospice/002_reference/debugging/get_integer.html)

This creates a pop-up window showing a custom message, with a button labeled "Ok", and prompts the user to input an integer value. The function will return the typed in integer, or the default value if nothing has been entered.

NOTE: THIS FUNCTION IS FOR DEBUG USE ONLY. Should you require this functionality in your final game, please use get_integer_async.

## [Strings](https://docs.yoyogames.com/source/dadiospice/002_reference/strings/index.html)

* [string(realNum)](https://docs.yoyogames.com/source/dadiospice/002_reference/strings/string.html)

With this function you can turn any real number into a string. If the real number is an integer, it will be saved with no decimal places, otherwise, it will be saved with two decimal places.

* [ord(str)](https://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fstrings%2Ford.html)­

This function takes a string (of a single character only) and returns the Unicode value for that character. In this way you can, for example, store as integers individual key presses, and it is most commonly used by the `keyboard_check()` functions.

* [string_width(string)](https://docs.yoyogames.com/source/dadiospice/002_reference/strings/string_width.html)

This function will return the width (in pixels) of the input string. It is very handy for calculating distances between text elements based on the total width of the letters that make up the string as it would be drawn with draw_text using the currently defined font.

* [string_height(string)](https://docs.yoyogames.com/source/dadiospice/002_reference/strings/string_height.html)

This function will return the height (in pixels) of the input string. It is very handy for calculating distances between text elements based on the tallest of the letters that make up the string as it would be drawn with draw_text using the currently defined font.

* [string_copy(str, index, count)](https://docs.yoyogames.com/source/dadiospice/002_reference/strings/string_copy.html)

With this function you can easily select a number of characters from within a string to be copied to another one. The first character in a string is always numbered as "1", so to copy (for example) the first five characters of string you would have `string_copy(str, 1, 5)`.

* [string_length(str)](https://docs.yoyogames.com/source/dadiospice/002_reference/strings/string_length.html)

This function returns the number of characters comprising a given string. It can be useful for things like working out when to limit a custom text entry's character length (eg: capping a player's name to 10 characters). Remember that this is different to string_width in that it measures the number of characters in the string, not its width as drawn on the screen in pixels.

## [Date and Time](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/index.html)

* [current_hour](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/current_hour.html)

This read only variable will return the hour that corresponds to the current moment based on the default time zone for the system (ie: local time). You can change the base time zone to use with the function `date_set_timezone()`.

* [current_minute](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/current_minute.html)

This read only variable will return the minutes that correspond to the current moment.

* [current_second](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/current_second.html)

This read only variable will return the seconds that correspond to the current moment.

* [current_day](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/current_day.html)

This read only variable will return the day as a value from 1 to 31, depending on the month.

* [current_month](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/current_month.html)

This read only variable returns the current month as a numeric value where 1 is January and 12 is December.

* [current_year](https://docs.yoyogames.com/source/dadiospice/002_reference/date%20and%20time/current_year.html)

This read only variable will return the current year.

## [Backgrounds](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/backgrounds/index.html)

* [background_index[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/backgrounds/background_index.html)

As with most resources, backgrounds can be assigned and changed by setting their index to a different game asset. This array is what you must use to change any one of the 8 possible backgrounds (numbered form 0 - 7 within the array) that a room may have, or to get the index of any of those backgrounds. When setting it you should use the index of the included image asset from the background resources, or, if you have loaded a background into the game using `background_add()`, the variable where you have stored the loaded background index. The value array for any one of the backgrounds can be set to -1 to remove the background.

* [background_hspeed[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/backgrounds/background_hspeed.html)

By setting this variable array to a different value, you can set the speed at which GameMaker: Studio automatically scrolls a background for you along the horizontal plane. A positive value will scroll from left to right, while a negative value will be right to left and 0 stops all scrolling. if you have also enabled horizontal tiling, either through the room editor or by using the background_htiled variable, then scrolling the background will make it loop infinitely.

* [background_vspeed[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/backgrounds/background_vspeed.html)

By setting this variable array to a different value, you can set the speed at which GameMaker: Studio automatically scrolls a background for you along the vertical plane. A positive value will scroll from top to bottom, while a negative value will be bottom to top and 0 stops all scrolling. if you have also enabled vertical tiling, either through the room editor or by using the background_vtiled variable, then scrolling the background will make it loop infinitely.

* [background_alpha[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/backgrounds/background_alpha.html)

This variable array returns the alpha (transparency) value of any one of the 8 backgrounds (numbered form 0 - 7 within the array) of the current room. This value can be anywhere between 0 and 1, where 0 indicates that the background is completely transparent and 1 (the default value) indicates that the background is completely opaque.

* [background_blend[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/backgrounds/background_blend.html)

This variable array returns the colour blend value of any one of the 8 backgrounds (numbered form 0 - 7 within the array) of the current room. The default value is -1 (which is also equal to the GameMaker: Studio constant c_white), but this can be set to any colour value with varying effects being achieved depending on the background image itself, as shown in the image below. For best results, it is recommended that you only blend a colour with a grey-scale, or black and white, image.

## [Audio](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/sounds/index.html)

* [audio_play_sound(index, priority, loop)](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/sounds/audio_play_sound.html)

With this function you can play any sound resource in your game. You provide the sound index and assign it a priority, which is then used to determine how sounds are dealt with when the number of sounds playing is over the limit set by the function audio_channel_num. Lower priority sounds will be stopped in favour of higher priority sounds, and the priority value can be any real number (the actual value is arbitrary, and can be from 0 to 1 or 0 to 100, as GameMaker: Studio will prioritize them the same). The final argument is for making the sound loop and setting it to true will make the sound loop until it is stopped and setting it to false will play the sound once only.

This function will also return a unique index number for the sound being played which can then be stored in a variable so that you can then pause it or stop it with the appropriate functions. This means that if you have multiple instances of the same sound playing at any one time you can target just one instance of that sound to deal with using the audio functions.

* [audio_stop_sound(index)](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/sounds/audio_stop_sound.html)

This function will stop the given sound if it is currently playing. The sound can either be a single instance of a sound (the index for individual sounds being played can be stored in a variable when using the audio_play_sound or audio_play_sound_at functions) or a sound asset, in which case all instances of the given sound will be stopped.

* [audio_stop_all()](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/sounds/audio_stop_all.html)

This function will stop all sounds that are currently playing.

* [audio_set_master_gain(listener, gain)](https://docs.yoyogames.com/source/dadiospice/002_reference/game%20assets/sounds/audio_set_master_gain.html)

With this function you can set the absolute value for the global volume of all sounds and music for a specific listener. The default listener index is 0, but you can use the function audio_get_listener_info to get the different indices available for the target platform. The gain value is based on a linear scale from 0 (silent) to 1 (full volume) and will affect the relative volume of all sounds and music played from within your game through that listener.

## [Drawing](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/index.html)

* [draw_set_color()](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/colour%20and%20blending/draw_set_colour.html)

With this function you can set the base draw colour for the game. This value will affect all further drawing where appropriate, including fonts, forms, primitives and 3D. If any of those assets are drawn with their own colour value changed, this value will be ignored.

* [draw_set_alpha()](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/colour%20and%20blending/draw_set_alpha.html)

With this function you can set the base draw alpha for the game. This value can be set from 0 to 1 with 0 being fully transparent and 1 being fully opaque (the default value), and will affect all further drawing, including backgrounds, sprites, fonts, primitives and 3D. If any of those assets are drawn with their own alpha value changed, this will be added to the base alpha value set by this function, so a base alpha of 0.5 and a sprite being drawn with an alpha of 0.5 will actually draw the sprite with an alpha of 0.25.

* [draw_circle(x,y,radius, outline)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_circle.html)

With this function you can draw either an outline of a circle or a filled circle. You can define how precise the drawing is with the function draw_set_circle_precision.

* [draw_line(x1,y1,x2,y2)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_line.html)

With this function you can draw a 1 pixel wide line between any two points in the game room.

* [draw_line_width(x1, y1, x2, y2, width)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_line_width.html)

With this function you can draw a line of a specified width between any two points in the game room.

* [draw_rectangle(x1, y1, x2, y2, outline)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_rectangle.html)

With this function you can draw either an outline of a rectangle or a filled rectangle where the (x1,y1) position is the top left corner and the (x2,y2) position is the bottom right corner.

* [draw_roundrect(x1, y1, x2, y2, outline)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_roundrect.html)

With this function you can draw either an outline of a rounded rectangle or a filled rounded rectangle where the (x1,y1) position is the top left corner and the (x2,y2) position is the bottom right corner. You can define how precise the drawing of the corners is with the function draw_set_circle_precision, but this function uses a fixed radius for them (should you need to change the corner radius, use the function `draw_roundrect_ext()`).

* [draw_ellipse(x1, y1, x2, y2, outline)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_ellipse.html)

With this function you can draw either an outline of an ellipse or a filled ellipse by defining a rectangular area that will then have the ellipse created to fit. You can define how precise the drawing is with the function draw_set_circle_precision.

* [draw_triangle(x1, y1, x2, y2, x3, y3, outline)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20basic%20forms/draw_triangle.html)

With this function you can draw either an outline of a triangle or a filled triangle.

* [draw_text(x, y, text)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20text/draw_text.html)

With this function you can draw any string at any position within the room (for drawing real numbers you should use the string function to convert them into text). To combine strings you can use + (see example below), you can also use # to add a line break to the string (should you need to display the # symbol, then you should precede it with a backslash like this "this will draw a \#") and you can also draw quotations by using inverted commas (for example 'I said "Hello"...'). The colour of the text and the alpha are governed by the current base alpha and colour values as set by draw_set_alpha and draw_set_colour

NOTE: The actual position of the text will be influenced by the alignment values set by draw_set_halign and draw_set_valign.

* [draw_set_font(font)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20text/draw_set_font.html)

This function will set the font to be used for all further text drawing. This font must have been added into the font assets of the game or have been created using either the font_add or font_add_sprite. You may also set this to -1 to default to drawing text using a 12point Arial font.

* [draw_set_halign(haling)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20text/draw_set_halign.html)

This function is used to align text along the horizontal axis and changing the horizontal alignment will change the position and direction in which all further text is drawn with the default value being fa_left. The following constants are accepted: fa_left, fa_center and fa_right.

* [draw_set_valign(valign)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20text/draw_set_valign.html)

This function is used to align text along the vertical axis and changing the vertical alignment will change the position and direction in which all further text is drawn, with the default value being fa_top. The following constants are accepted: fa_top, fa_middle and fa_bottom.

* [draw_background(background, x, y)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20sprites%20and%20backgrounds/draw_background.html)

With this function you can draw any of the game's background assets at a given position within the room, with the top left corner of the image being drawn at the specified x/y position.

* [draw_background_ext(background, x, y, xscale, yscale, rot, colour, alpha)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20sprites%20and%20backgrounds/draw_background_ext.html)

This function will draw the given background as in the function draw_background but with additional options to change the scale, blending, rotation and alpha of the background being drawn. Changing these values does not modify the resource in any way (only how it is drawn), and you can use any of the available background variables instead of direct values for all the arguments in the function.

NOTE: Colour blending is only recommended for the HTML5 target when WebGL is enabled, although you can still set the blending colour if it is not enabled and it will blend the sprite as normal. However all blending in this way creates a duplicate sprite which is then stored in the cache and used when required. This is far from optimal and if you use multiple colour changes it will slow down your games performance unless you activate WebGL. If you do not wish to use WebGL, and still require blended images, then you should consider using sprites and setting the sprite cache to help limit performance issues - see sprite_set_cache_size.

* [draw_sprite(sprite, subimage, x, y)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20sprites%20and%20backgrounds/draw_sprite.html)

This function draws the given sprite and sub-image at a position within the game room. For the sprite you can use the instance variable sprite_index to get the current sprite that is assigned to the instance running the code, or you can use any other sprite asset. The same goes for the sub-image, as this can also be set to the instance variable image_index which will set the sub-image to that selected for the current instance sprite (note, that you can draw a different sprite and still use the sub-image value for the current instance), or you can use any other value for this to draw a specific sub-image of the chosen sprite. If the value is larger than the number of sub-images, then GameMaker: Studio will automatically loop the number to select the corresponding image (for example, if the sprite being drawn has 5 sub-images numbered 0 to 4 and we set the index value to 7, then the function will draw sub-image 3, numbered 0). Finally, the x and y position is the position within the room that the sprite will be drawn, and it is centered on the sprite x offset and y offset.

* [draw_sprite_ext(sprite, subimg, x, y, xscale, yscale, rot, colour, alpha)](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20sprites%20and%20backgrounds/draw_sprite_ext.html)

This function will draw the given sprite as in the function draw_sprite but with additional options to change the scale, blending, rotation and alpha of the sprite being drawn. Changing these values does not modify the resource in any way (only how it is drawn), and you can use any of the available sprite variables instead of direct values for all the arguments in the function.

* [draw_self()](http://docs.yoyogames.com/source/dadiospice/002_reference/drawing/drawing%20sprites%20and%20backgrounds/draw_self.html)

This function draws the sprite assigned to the instance exactly as it would be drawn if the draw event held no code or actions, and will reflect and changes that have been made to the sprite variables in other events.

NOTE: If the instance has no sprite assigned to it, this function will throw an error!­

## [Views](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/index.html)

* [view_xview[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_xview.html)

This variable can be used to get or to set the x axis position for the view in the room. By changing this value you can set the view to a new position, with (0,0) being the upper left corner of the room, or you can reference this variable to ensure that an instance is always drawn at a relative position to the view (see example code below). This value can also be negative and so show an area that is outside of the room, in which case the window colour will be used (this colour can be set with window_set_colour).

* [view_yview[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_yview.html)

This variable can be used to get or to set the y axis position for the view in the room. By changing this value you can set the view to a new position, with (0,0) being the upper left corner of the room, or you can reference this variable to ensure that an instance is always drawn at a relative position to the view (see example code below). This value can also be negative and so show an area that is outside of the room, in which case the window colour will be used (this colour can be set with window_set_colour).

* [view_wview[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_wview.html)

This variable can be used to get or to set the width of the view in the room. By changing this value you can change the amount of a room that you can see through the view, but bear in mind that this does not change the view port so setting a view width larger than the view port width will result in the view being scaled down to fit the port, just as a view width smaller than the port width will scale the view up to fit.

* [view_hview[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_hview.html)

This variable can be used to get or to set the height of the view in the room. By changing this value you can change the amount of a room that you can see through the view, but bear in mind that this does not change the view port so setting a view height larger than the view port height will result in the view being scaled down to fit the port, just as a view height smaller than the port height will scale the view up to fit.

* [view_object[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_object.html)

With this variable you can get (or set) the object that has to be kept in the specified view (from 0 to 7) at all times. If there are multiple instances of this object, only one is followed (usually the first one created, but this is not guaranteed). You can also assign a single instance id to this variable, in which case that particular instance is followed. To prevent any view following, you can set this variable using the special keyword noone.

* [view_hspeed[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_hspeed.html)

This variable controls the horizontal movement speed of the view when it has an instance to follow (this can be set with the view_object variable or in the room editor). Care should be taken when setting this value, as setting it too low can result in the instance moving faster than the view can and so it may disappear out one side of the view until it stops and the view catches it again.

* [view_vspeed[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_vspeed.html)

This variable controls the vertical movement speed of the view when it has an instance to follow (this can be set with the view_object variable or in the room editor). Care should be taken when setting this value, as setting it too low can result in the instance moving faster than the view can and so it may disappear out one side of the view until it stops and the view catches it again.

* [view_angle[i]](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/views/view_angle.html)

With this variable, you can get (or set) the angle at which the view is to be drawn. The default angle is 0º but it can be set to any angle between -359º and 359º. This will not affect how the game is played as it is only for setting the angle at which the view is drawn. Often it is used to create a rotating minimap, or to "shake" the view for example.

NOTE: This variable will not work on the HTML5 target module.

## [HTML5](https://docs.yoyogames.com/source/dadiospice/002_reference/html5/index.html)

* [url_open(url)](https://docs.yoyogames.com/source/dadiospice/002_reference/html5/url_open.html)

This will open the specified URL on the browser of the chosen target device, or, if you are using the HTML5 module, in the currently open browser.

## [The Game Window](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/the%20game%20window/index.html)

* [window_get_fullscreen()](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/the%20game%20window/window_get_fullscreen.html)

This function returns whether the game window is in fullscreen mode (true) or not (false).

* [window_set_fullscreen(full)](https://docs.yoyogames.com/source/dadiospice/002_reference/windows%20and%20views/the%20game%20window/window_set_fullscreen.html)

With this function you can set the game window to be full screen (true) or not (false). Please note that for the Mac OSX target, you must have the "Start In Fullscreen" option selected in the Global Game Settings, otherwise this function will fail.

## [Operating Systems](https://docs.yoyogames.com/source/dadiospice/002_reference/operating%20system/index.html)

* [os_type](https://docs.yoyogames.com/source/dadiospice/002_reference/operating%20system/os_type.html)

This variable holds one of various constant GameMaker: Studio has to tell you which operating system the game has been created for. Note that this is not necessarily the same as the OS of the device running it, since - for example - your game could be running on an Amazon Fire OS, but will have been built for the Android platform (in which case os_type will be os_android).

## [Device Input](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/device%20input/index.html)

* [device_get_tilt_x()](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/device%20input/device_get_tilt_x.html)

This function returns a value between -1 and 1 depending upon the angle of "tilt" of the device. The actual correlation between degrees of tilt and the value returned depends on the device and OS that it uses, but generally a value of 1 or -1 is the same as +/-90°.

* [device_get_tilt_y()](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/device%20input/device_get_tilt_y.html)

This function returns a value between -1 and 1 depending upon the angle of "tilt" of the device. The actual correlation between degrees of tilt and the value returned depends on the device and OS that it uses, but generally a value of 1 or -1 is the same as +/-90°.

* [device_get_tilt_z()](https://docs.yoyogames.com/source/dadiospice/002_reference/mouse,%20keyboard%20and%20other%20controls/device%20input/device_get_tilt_z.html)

This function returns a value between -1 and 1 depending upon the angle of "tilt" of the device. The actual correlation between degrees of tilt and the value returned depends on the device and OS that it uses, but generally a value of 1 or -1 is the same as +/-90°.

## [Files](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/index.html)

* [file_text_open_write(fname)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_open_write.html)

This function opens the text file with the indicated filename for writing only (if the file does not exist, it is created), returning the unique id of the file that which should be stored in a variable as it will be used for all further actions to do with that file. Note that if the file can't be created (because of an illegal filename, for example) the function will return -1.

NOTE: You can only have a maximum of 32 files open at any one time. You should also always close files when finished as this writes the information and frees the memory associated with the file.

WARNING! This function may not work as you expect due to GameMaker: Studio being sandboxed! Please see the section on File System Limits for more information.

* [file_text_write_string(file, str)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_write_string.html)

With this function you can write a string to a previously opened text file. If the file already contains information, this information will be erased and the string will be written at the beginning of the file, unless you have opened the file with the file_text_open_append. You can also avoid this by using the file_text_readln function along with the file_text_eof function to loop through the contents of the file until you get to the end and then start writing.

* [file_text_write_real(file, val)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_write_real.html)

With this function you can write a number to the previously opened text file. Note that as the value to be written can be a real number, all decimals will be written with a "." point as separator. If the file already contains information, this information will be erased and the string will be written at the beginning of the file, unless you have opened the file with the file_text_open_append. You can also avoid this by using the file_text_readln function along with the file_text_eof function to loop through the contents of the file until you get to the end and then start writing.

It is important to note that when writing very large numbers to a text file using this function, it may be translated into a standard simplified format, like "6.6624e+003", which cannot be read back in to GameMaker: Studio correctly. To prevent issues like this, you should instead convert the value to a string and use the function `file_text_write_string()` instead.

* [file_text_writeln(file)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_writeln.html)

With this function you can write a new line to an opened text file. In this way you can skip lines or write information on a line by line basis.

* [file_text_close(file)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_close.html)

Once you have finished working with a given file (whether reading from it or writing to it), you must close the file again, or else you risk losing the information contained within. This also prevents memory leaks and makes sure that you never go over the file limit by having more than 32 files open.

* [file_text_open_read(fname)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_open_read.html)

This function opens the text file with the indicated filename for reading only, returning the unique id of the file that which should be stored in a variable as it will be used for all further actions to do with that file. If the file does not exists then the function will return the value -1.

NOTE: You can only have a maximum of 32 files open at any one time. You should also always close files when finished as this frees the memory associated with the file.

WARNING! This function may not work as you expect due to GameMaker: Studio being sandboxed! Please see the section on File System Limits for more information.

* [file_text_read_string(file)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_read_string.html)

With this function you can read a string from a text file and the function returns that value to be used or stored in a variable.

* [file_text_read_real(file)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_read_real.html)

With this function you can read a real number value from a text file and the function returns that value to be used or stored in a variable.

* [file_text_readln(file)](https://docs.yoyogames.com/source/dadiospice/002_reference/file%20handling/files/file_text_readln.html)

With this function you can skip the remainder of the current line from a given opened text file and move to the start of the next one. The function will also return the full line as a string, making it an easy way to read complete "chunks" of data for parsing later.

## [Paths](https://docs.yoyogames.com/index.html?page=source%2Fdadiospice%2F002_reference%2Fpaths%2Fpath_start.html)

* [path_start(path, speed, end_action, absolute)](https://docs.yoyogames.com/source/dadiospice/002_reference/paths/path_start.html)

A path is created from a series of defining points that are linked together and then used to plan the movements of an instance. They can be created with code, or in the Path Editor and they are assigned to an instance to use in the game. You would then use this function to tell your instance which path to follow, what speed to follow the path (measured in pixels per step), how to behave when it reaches the end of the path, and whether to follow the absolute or relative path position. This last part means that it either starts and follows the path exactly as you designed and placed it in the Path Editor (absolute), or it starts and follows the path from the position at which the instance was created (relative).

## [Math](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/index.html)

* [randomize()](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/real%20valued%20functions/randomize.html)

This function sets the seed to a random value. Should you need to keep a consistent value over a number of runs of a game, you should be using `random_set_seed()`. Please note, that when using the random number functions in GameMaker: Studio the initial seed is always the same, as this makes tracing errors and debugging far easier. Should you wish to test with true random, you should call this function at the start of your game.

* [random(n)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/real%20valued%20functions/random.html)

This function is good for probabilities where returning an integer (whole number) is not necessary. For example, random(100) will return a value from 0 to 99, but that value can be 22.56473! You can also use real numbers and not integers in this function like this - random(0.5), which will return a value between 0 and 0.4999999.

NOTE: This function will return the same value every time the game is run afresh due to the fact that GameMaker: Studio generates the same initial random seed every time to make debugging code a far easier task. To avoid this behaviour use randomize at the start of your game.

* [floor(n)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/real%20valued%20functions/floor.html)

Returns the floor of n, that is, n rounded down to an integer. This is similar to the `round()` function, but it only rounds down, no matter what the decimal value, so floor(5.99999) will return 5, as will floor(5.2), floor(5.6457) etc...

* [ceil(n)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/real%20valued%20functions/ceil.html)

This function takes any real number and rounds it up to the nearest integer. Care should be taken with this function as one common mistake is to use it round up a random value and expect it always to be greater than 1, ie:

    int = ceil(random(5));

Now, you would expect this code to always give an integer between 1 and 5, but this may not always be the case as there is a very small possibility that the random function will return 0, and rounding up 0 still gives you 0. This is a remote possibility but should be taken into account when using this function.

* [round(n)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/real%20valued%20functions/round.html)

Just as it says, `round()` takes a real number and rounds it up or down to the nearest integer. In the special case where the number supplied is exactly a half-integer (1.5, 17.5, -2.5, etc), the number will be rounded to the nearest even value, for example, 2.5 would be rounded to 2, while 3.5 will be rounded to 4. This type of rounding is called bankers rounding and over large numbers of iterations or when using floating point maths, it gives a statistically better rounding than the more traditional "round up if over .5 and round down otherwise" approach.

What this means is that if the fraction of a value is 0.5, then the rounded result is the even integer nearest to the input value. So, for example, 23.5 becomes 24, as does 24.5, while -23.5 becomes -24, as does -24.5. This method treats positive and negative values symmetrically, so is therefore free of sign bias, and, more importantly, for reasonable distributions of values, the expected (average) value of the rounded numbers is the same as that of the original numbers.

* [choose(val0, val1, val2, ...., max_val)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/real%20valued%20functions/choose.html)

Sometimes you want to specify something other than numbers for a random selection, or the numbers you want are not in any real order or within any set range. In these cases you would use `choose()` to generate a random result. For example, say you want to create an object with a random sprite at the start, then you could use this function to set the sprite index to one of a set of sprites. Note that you can have as many as you require (more arguments will mean that the function will be slower to parse).

NOTE: This function will return the same value every time the game is run afresh due to the fact that GameMaker: Studio generates the same initial random seed every time to make debugging code a far easier task. To avoid this behaviour use randomize at the start of your game.

## [Functions - GameMaker: Studio - Distance_to](https://youtu.be/VRvHaXppiAM)

* [distance_to_point(x, y)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/distance_to_point.html)

This function calculates the distance from the edge of the bounding box of the calling instance to the specified x/y position in the room, with the return value being in pixels. Note that if the calling object have no sprite or no mask defined, the results will be incorrect.

* [distance_to_object(obj)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/movement/distance_to_object.html)

This function calculates the distance from the edge of the bounding box of the calling instance to the nearest edge of the nearest instance of the object specified. The object can be an object index or a specific instance id as well as the keyword other, and the distance is returned in pixels. Note that if either of the objects have no sprite or no mask defined, the results will be incorrect.

## [GameMaker: Studio - Basic Motion Planning](https://youtu.be/8TTECzmGYOc)

* [mp_linear_step_object(xgoal, ygoal, stepsize, obj)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/motion%20planning/mp_linear_step_object.html)

With this function you tell an instance to take a "step" towards a specific point, specified by the xgoal and ygoal values. The size of the step (which is how many pixels the instance should move each step) is indicated by the stepsize, and if the instance is already at the position it will stop and not move any further, contrary to other, simpler functions like move_towards_point. The stepsize is also the distance "ahead" that the object will check each step for a collision, and you can choose whether the instance stops at a collision with an object or instance of your choice.

* [mp_linear_step_object(xgoal, ygoal, stepsize, obj)](https://docs.yoyogames.com/source/dadiospice/002_reference/movement%20and%20collisions/motion%20planning/mp_potential_step_object.html)

This function lets the instance take a step towards a particular position defined by xgoal/ygoal, all the while trying to avoid obstacles. When the instance would run into an instance of the object specified by the "obj" argument it will change the direction of motion to try to avoid that instance and move around it. This approach is not guaranteed to work but in most easy cases it will effectively move the instance towards the goal. The function returns whether the goal was reached or not.

## [Functions - GameMaker: Studio - Point Functions](https://youtu.be/ij8Q_SnhWww)

* [point_direction(x1, y1, x2, y2)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/vector%20functions/point_direction.html)

This function returns the direction of a vector formed by the specified components [x1,y1] and [x2,y2] in relation to the fixed x/y coordinates of the room.

* [point_distance(x1, y1, x2, y2)](https://docs.yoyogames.com/source/dadiospice/002_reference/maths/vector%20functions/point_distance.html)

This function returns the length of a vector formed by the specified components [x1,y1] and [x2,y2]

## Enlaces de interés

* [GM:S 1.4](https://docs.yoyogames.com/)
* [Game Maker Language: 120 funciones y variables importantes (1/3)](https://www.youtube.com/watch?v=Dag3uzwBb8w)
* [Game Maker Language: 120 funciones y variables importantes (2/3)](https://www.youtube.com/watch?v=rRze0C9TF94)
* [Game Maker Language: 120 funciones y variables importantes (3/3)](https://www.youtube.com/watch?v=UKcwZ0fsTvc)
