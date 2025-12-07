<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Real-time News Subscription Service</title>
</head>
<body>

<div class="container">

<h1>Real-time News Subscription Service</h1>

<p><span class="badge">Observer Pattern</span> <span class="badge">Java</span> <span class="badge">Design Patterns</span> <span class="badge">Scalable</span></p>

<h2>Background</h2>
<p>You're tasked with designing a <strong>real-time news subscription service</strong> for a media company. The system must notify subscribers instantly when breaking news is published by the news agency.</p>

<h2>Scenario Description</h2>
<p>The system consists of two core components:</p>

<ul>
  <li><strong>NewsAgency</strong>: The central publisher of news. Maintains a list of subscribers and pushes updates in real time.</li>
  <li><strong>Subscriber</strong>: Represents users (mobile apps, email clients, web dashboards) that receive instant breaking news alerts.</li>
</ul>

<h2>Requirements</h2>

<ol>
  <li><strong>Subscription Management</strong>
    <ul>
      <li>Users can subscribe and unsubscribe at any time.</li>
      <li>All active subscribers are notified immediately when news is published.</li>
    </ul>
  </li>

  <li><strong>Dynamic Subscription Updates</strong>
    <ul>
      <li>Subscribers can join or leave without affecting others.</li>
      <li>No disruption during subscription changes.</li>
    </ul>
  </li>

  <li><strong>Decoupled Communication</strong>
    <ul>
      <li><strong>Push-based model</strong>: Agency pushes news — subscribers do <em>not</em> poll.</li>
      <li>Loose coupling between publisher and subscribers.</li>
    </ul>
  </li>
</ol>

<h2>Expected Behavior</h2>
<ul>
  <li>When breaking news is published, <strong>all current subscribers</strong> receive it instantly.</li>
  <li>Subscribers can dynamically subscribe/unsubscribe.</li>
  <li>System is ready for future extensions (e.g., topic-based filtering, user preferences, priority levels).</li>
</ul>

<h2>Constraints</h2>
<ul>
  <li>Must be <strong>scalable</strong> for thousands or millions of subscribers.</li>
  <li>Follow <strong>clean object-oriented principles</strong> and <strong>loose coupling</strong>.</li>
  <li>Use a proven design pattern suitable for real-time notifications.</li>
</ul>

<h2>Design Pattern Used</h2>
<p><strong>Observer Pattern (Publish-Subscribe)</strong> — Perfectly fits the requirement of one-to-many dependency with automatic updates.</p>

<h2>Features Implemented</h2>
<ul>
  <li>Real-time push notifications</li>
  <li>Dynamic subscribe/unsubscribe</li>
  <li>Thread-safe notification handling</li>
  <li>Multiple subscriber types (Mobile, Email, Web Dashboard)</li>
  <li>Clean, extensible, and production-like structure</li>
</ul>

<hr>

<footer>
  <p>Real-time News Subscription Service &copy; 2025 | Built with Java &amp; Observer Pattern</p>
</footer>

</div>

</body>
</html>
