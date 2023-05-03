package com.example.demo.study.springsecurity;

/**
 * 加密解密 需要是可逆的 即明文经过加密成密文后 需要可以通过密文解密回明文
 *
 * hash处理是不可逆的  明文经过hash处理成密文后 密文不可以直接转回明文
 * hash匹配流程：明文hash成为hash值后 存入数据库
 * 下次再传入明文 也进行hash处理 如果两者hash值相同 则密码正确
 *
 *
 * 但经常将hash说成为hash加密 不需要纠结
 *
 * springSecurity使用BCryptPasswordEncoder方法采用SHA-256 +随机盐+密钥对密码进行加密
 */
public class main {
}
