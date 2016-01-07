var gulp = require('gulp');
var jshint = require('gulp-jshint');
var concat = require('gulp-concat');
var uglify = require('gulp-uglify');
var rename = require('gulp-rename');
var argv = require('yargs').argv;
var dist = './target/classes/META-INF/resources/webjars';

gulp.task('package scripts', function () {
    return gulp.src('js/**/*.js')
        .pipe(concat('all.js'))
        .pipe(gulp.dest(dist.concat('/js')))
        .pipe(rename('all.min.js'))
        .pipe(uglify())
        .pipe(gulp.dest(dist.concat('/js')))
});

gulp.task('package html', function () {
    return gulp.src('html/**/*.html')
        .pipe(gulp.dest(dist.concat('/html')))
});

gulp.task('build', ['package scripts','package html']);
