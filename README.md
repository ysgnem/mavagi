# MAVAGI — Java Foundation

MAVAGI の Discord Bot 開発用スケルトンです。**現時点では機能を実装していません。**

## 方針

- Java 21
- Maven
- JDA 6.7.0
- SLF4J + Logback
- dotenv-java（ローカル開発用）
- JUnit 5
- パッケージルートは `mavagi`
- 7種類のBotを、それぞれ独立したエントリーポイント・プロセスとして起動

## 含まれるもの

- Botごとの起動クラス
- 共通の起動処理
- 環境変数 / `.env` からのトークン読み込み
- JDA接続とReadyイベントの共通ログ
- ログ出力設定
- 最小限のJUnitテスト

## 含まれないもの

スラッシュコマンド、ボタン、メッセージ処理、権限・ロール管理、経済機能、DB、AI/Ollama、音楽再生、TTS/VOICEVOX、FFmpeg、スケジューラー、監視・稼働時間表示など、Bot固有の機能は一切含みません。

## セットアップ

1. Java 21 と Maven をインストール
2. `.env.example` を `.env` にコピー
3. 起動したいBotのトークンを `.env` に設定
4. Mavenでビルド

```bash
mvn clean test
```

## 起動例

```bash
mvn exec:java -Dexec.mainClass="mavagi.community.CommunityBotApplication"
```

ほかのBotも `mavagi.<package>.<ApplicationClass>` を指定して個別に起動します。複数Botを同時に動かす場合は、プロセスごとに起動してください。

## 機能追加の基本ルール

- 共通処理は `mavagi.shared` 配下に置く
- Bot固有処理は各Botのパッケージ配下に置く
- 起動クラスに機能ロジックを詰め込まない
- トークンや秘密情報をソースコードへ直書きしない
- 機能追加時は対応するテストも追加する
