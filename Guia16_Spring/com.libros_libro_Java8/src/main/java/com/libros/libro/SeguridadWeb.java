/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libro;

//import com.libros.libro.Entities.Usuario;
//import com.libros.libro.services.UsuarioServicio;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 *
 * @author LINA RAMIREZ
 */

//@Configuration
//@EnableWebSecurity

public class SeguridadWeb {
    
////    protected void configure(HttpSecurity http) throws Exception{
////        http
////                .authorizeRequests()
////                    .antMatchers("/css/*", "/js/*", "/img/*", "/**")
////                    .permitAll()
////                .and.formLogin().
////                    .loginPage("/login")
////                    .loginProcessingUrl("/logincheck")
////                    .usernameParameter("email")
////                    .passwordParameter("password")
////                    .defaultSuccessUrl("inicio")
////                    .permitAll()
////                .and().logout()
////                    .logoutUrl("/logout")
////                    .logoutSuccesUrl("/")
////                    .permitAll();
////                
////    }
//    
//    
////    extends WebSecurityConfigurerAdapter
//    @Autowired
//    public UsuarioServicio usuarioServicio;
//
//    public SeguridadWeb(UsuarioServicio usuarioServicio) {
//        this.usuarioServicio = usuarioServicio;
//    }
//    
//    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService(usuarioServicio)
//                .passwordEncoder(new BCryptPasswordEncoder());
//    }
//    
// 
//    @Bean
//    protected WebSecurityCustomizer webSecurityCustomizer(){
//        
//        return (web)->web.ignoring().requestMatchers("/css/*", "/js/*", "/img/*", "/**");
//    }
//    
////    @Bean
////    public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception{
////
////        http.authorizeRequests().requestMatchers("/css/","/js/","/img/","/*").permitAll();
////
////        return http.build();
////    }
//    
//    @Bean
//    public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception{
//
//        http.authorizeRequests().requestMatchers("/css/","/js/","/img/","/*").permitAll()
//                .and().formLogin()
//                    .loginPage("/login")
//                    .loginProcessingUrl("/logincheck")
//                    .usernameParameter("email")
//                    .p
//        
//        return http.build();
//    }
//    
//    
////    @Bean
////    public SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> securityConfigurerAdapter() {
////        return new SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>() {
////            @Override
////            public void configure(HttpSecurity http) throws Exception {
////                http.authorizeRequests(authorizeRequests ->
////                        authorizeRequests
////                                .requestMatchers("/css/**", "/js/**", "/img/**","/**").permitAll()
//////                                .anyRequest().authenticated()
////                );
//////                .formLogin(formLogin ->
//////                        formLogin
//////                                .loginPage("/login")
//////                                .loginProcessingUrl("/logincheck")
//////                                .usernameParameter("email")
//////                                .passwordParameter("password")
//////                                .defaultSuccessUrl("/inicio")
//////                                .permitAll()
//////                )
//////                .logout(logout ->
//////                        logout
//////                                .logoutUrl("/logout")
//////                                .logoutSuccessUrl("/")
//////                                .permitAll()
//////                );
////            }
////        };
////    }
////    
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http
////                .authorizeHttpRequests(authorize -> authorize
////                        .requestMatchers("/css/**", "/js/**", "/login").permitAll()
////                        .requestMatchers("/admin").hasRole(Usuario.Rol.ADMIN.toString())
////                        .requestMatchers("/").hasAnyRole(
////                                Usuario.Rol.ADMIN.toString(), Usuario.Rol.USER.toString())
////                        .anyRequest().authenticated())
////                .formLogin(Customizer.withDefaults())
////                .logout(logout -> logout
////                        .deleteCookies("JSESSIONID")
////                        .invalidateHttpSession(true));
////
////        return http.build();
////    }
////    

}
